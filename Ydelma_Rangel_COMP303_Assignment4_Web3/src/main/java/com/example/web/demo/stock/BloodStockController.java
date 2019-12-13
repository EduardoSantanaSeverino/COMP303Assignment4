package com.example.web.demo.stock;

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
public class BloodStockController {
	
	@Autowired
	private BloodStockService bloodStockService;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	
	@GetMapping("/stocks")
	public String getAll(Model model, HttpServletRequest request) 
	{
		String error_message = getErrorMessage(request);
		String info_message = getInfoMessage(request);
		List<BloodStock> items = this.bloodStockService.getAll();
		model.addAttribute("items", items);
		model.addAttribute("error_message", (error_message == "null" ? "" : error_message));
		model.addAttribute("info_message", (info_message == "null" ? "" : info_message));
		return "stocks/list";
	}
	
	@GetMapping("/stocks/update/{id}")
	public String updateItem(@PathVariable int id, Model model)
	{
		BloodStock bloodStock = this.bloodStockService.getItem(id);
		model.addAttribute("bloodStock", bloodStock);
		return "stocks/update";
	}
	
	@RequestMapping(value = "/stocks/update", method = RequestMethod.POST)
    public String updateItem(@ModelAttribute @Valid BloodStock item, BindingResult bindingResult, Model model, HttpServletRequest request)
	{
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "stocks/update";
        } 
		else {
        	this.bloodStockService.updateItem(item.getStockId(), item);
    		boolean isValid = item != null;
    		
    		if(isValid)
    		{
    			request.getSession().setAttribute("info_message", "Information Saved Correctly!");
    		}
    		else
    		{
    			request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
    		}    		
    		return "redirect:/stocks";	
        }
		
	}
	
	@GetMapping("/stocks/create")
	public String createItem(Model model)
	{
		model.addAttribute("bloodStock", new BloodStock());
		return "stocks/create";
	}

	@RequestMapping(value = "/stocks/create", method = RequestMethod.POST)
    public String createItem(@ModelAttribute @Valid BloodStock item, BindingResult bindingResult, Model model, HttpServletRequest request){
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "stocks/create";
        } 
		else {
			this.bloodStockService.createItem(item);
			boolean isValid = item != null;
			
			if(isValid)
			{
				request.getSession().setAttribute("info_message", "Information Saved Correctly!");
			}
			else
			{
				request.getSession().setAttribute("error_message", "There were some errors trying to save your information, please talk to administrators at +1 (471) 562 - 5656 !");
			}
			return "redirect:/stocks";	
		}	
	}
	
		
	@RequestMapping(value = "/stocks/delete/{id}", method = RequestMethod.POST)
	public ModelAndView deleteItem(@PathVariable int id, HttpServletRequest request)
	{

		this.bloodStockService.deleteItem(id);
		
		request.getSession().setAttribute("info_message", "BloodStock Deleted Correctly!");
		
		return new ModelAndView("redirect:/stocks", new HashMap<>());
		
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
	
