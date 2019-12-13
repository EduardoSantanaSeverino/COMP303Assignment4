package com.example.service.demo.stocks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController  @Api(value="BloodStockrestcontroller", description="Operations pertaining to BloodStocks") 
public class BloodStockRestController {
	
	@Autowired
	private BloodStockService bloodStockService;
	
	@RequestMapping(value = "/api/bloodstocks", method = RequestMethod.GET)
	public List<BloodStock> getAll()
	{
		return this.bloodStockService.getAll();
	}
	
	@RequestMapping(value = "/api/bloodstocks/{id}", method = RequestMethod.GET)
	public BloodStock getItem(@PathVariable int id)
	{
		return this.bloodStockService.getItem(id);
	}
	
	@RequestMapping(value = "/api/bloodstocks", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void createItem(@RequestBody BloodStock item)
	{
		this.bloodStockService.createItem(item);
	}
	
	@RequestMapping(value = "/api/bloodstocks/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void updateItem(@PathVariable int id, @RequestBody BloodStock item)
	{
		this.bloodStockService.updateItem(id, item);
	}
	
	@RequestMapping(value = "/api/bloodstocks/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteItem(@PathVariable int id)
	{
		this.bloodStockService.deleteItem(id);
	}
	
}