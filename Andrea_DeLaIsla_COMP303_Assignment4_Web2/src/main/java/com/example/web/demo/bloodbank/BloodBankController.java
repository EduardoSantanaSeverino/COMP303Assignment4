package com.example.web.demo.bloodbank;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BloodBankController {
	@Autowired
	private BloodBankService bloodBankService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	
	@GetMapping("/bloodbanks")
	public String getAll(Model model, HttpServletRequest request) 
	{
		String error_message = getErrorMessage(request);
		String info_message = getInfoMessage(request);
		List<BloodBank> items = this.bloodBankService.getAll();
		model.addAttribute("items", items);
		model.addAttribute("error_message", (error_message == "null" ? "" : error_message));
		model.addAttribute("info_message", (info_message == "null" ? "" : info_message));
		return "bloodbank/list";
	}
	
	@GetMapping("/bloodbanks/update/{id}")
	public String updateItem(@PathVariable int id, Model model)
	{
		BloodBank bloodBank = this.bloodBankService.getItem(id);
		model.addAttribute("bloodBank", bloodBank);
		return "bloodbank/update";
	}
	
	@RequestMapping(value = "/bloodbanks/update", method = RequestMethod.POST)
    public String updateItem(@ModelAttribute @Valid BloodBank item, BindingResult bindingResult, Model model, HttpServletRequest request)
	{
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "bloodbank/update";
        } 
		else {
        	this.bloodBankService.updateItem(item.getId(), item);
    		boolean isValid = item != null;
    		
    		if(isValid)
    		{
    			request.getSession().setAttribute("info_message", "Information Saved Correctly!");
    		}
    		else
    		{
    			request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
    		}
    		
    		return "redirect:/bloodbanks";	
        }
		
	}
	
	@GetMapping("/bloodbanks/create")
	public String createItem(Model model)
	{
		model.addAttribute("bloodBank", new BloodBank());
		return "bloodbank/create";
	}

	@RequestMapping(value = "/bloodbanks/create", method = RequestMethod.POST)
    public String createItem(@ModelAttribute @Valid BloodBank item, BindingResult bindingResult, Model model, HttpServletRequest request)
	{
	
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "bloodbank/create";
        } 
		else {
			this.bloodBankService.createItem(item);
			boolean isValid = item != null;
			
			if(isValid)
			{
				request.getSession().setAttribute("info_message", "Information Saved Correctly!");
			}
			else
			{
				request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
			}
			return "redirect:/bloodbanks";	

		}
		
	}
	
	@GetMapping("/bloodbanks/details/{id}")
	public String detailsItem(@PathVariable int id, Model model)
	{
		BloodBank bloodBank = this.bloodBankService.getItem(id);
		model.addAttribute("bloodBank", bloodBank);
		return "bloodbank/details";
	}
		
	@RequestMapping(value = "bloodbanks/delete/{id}", method = RequestMethod.POST)
	public ModelAndView deleteItem(@PathVariable int id, HttpServletRequest request)
	{

		this.bloodBankService.deleteItem(id);
		request.getSession().setAttribute("info_message", "Blood Bank Deleted Correctly!");
		return new ModelAndView("redirect:/bloodbanks", new HashMap<>());
	}
	
	private String getErrorMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("error_message");
		request.getSession().setAttribute("error_message", "");
		return String.valueOf(retVal);
	}
	
	private String getInfoMessage(HttpServletRequest request)
	{
		Object retVal = request.getSession().getAttribute("info_message");
		request.getSession().setAttribute("info_message", "");
		return String.valueOf(retVal);
	}
}
