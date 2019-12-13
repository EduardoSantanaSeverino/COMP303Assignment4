package com.example.service.demo.bloodbank;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloodBankRestController {
	
	@Autowired
	private BloodBankService bloodBankService;
	
	@RequestMapping(value = "/api/bloodbanks", method = RequestMethod.GET)
	public List<BloodBank> getAll()
	{
		return this.bloodBankService.getAll();
	}
	
	@RequestMapping(value = "/api/bloodbanks/{id}", method = RequestMethod.GET)
	public BloodBank getItem(@PathVariable int id)
	{
		return this.bloodBankService.getItem(id);
	}
	
	@RequestMapping(value = "/api/bloodbanks", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void createItem(@Valid @RequestBody BloodBank item)
	{
		this.bloodBankService.createItem(item);
	}
	
	@RequestMapping(value = "/api/bloodbanks/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void updateItem(@PathVariable int id, @Valid @RequestBody BloodBank item)
	{
		this.bloodBankService.updateItem(id, item);
	}
	
	@RequestMapping(value = "/api/bloodbanks/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteItem(@PathVariable int id)
	{
		this.bloodBankService.deleteItem(id);
	}

}
