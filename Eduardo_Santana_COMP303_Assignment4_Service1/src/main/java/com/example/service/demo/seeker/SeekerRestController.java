/**
 * 
 */
package com.example.service.demo.seeker;

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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@RestController  @Api(value="seekerrestcontroller", description="Operations pertaining to seekers") 
public class SeekerRestController {
	
	@Autowired
	private SeekerService seekerService;
	
	@RequestMapping(value = "/api/seekers", method = RequestMethod.GET)
	public List<Seeker> getAll()
	{
		return this.seekerService.getAll();
	}
	
	@RequestMapping(value = "/api/seekers/{id}", method = RequestMethod.GET)
	public Seeker getItem(@PathVariable int id)
	{
		return this.seekerService.getItem(id);
	}
	
	@RequestMapping(value = "/api/seekers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void createItem(@RequestBody Seeker item)
	{
		this.seekerService.createItem(item);
	}
	
	@RequestMapping(value = "/api/seekers/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void updateItem(@PathVariable int id, @RequestBody Seeker item)
	{
		this.seekerService.updateItem(id, item);
	}
	
	@RequestMapping(value = "/api/seekers/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteItem(@PathVariable int id)
	{
		this.seekerService.deleteItem(id);
	}
	
}