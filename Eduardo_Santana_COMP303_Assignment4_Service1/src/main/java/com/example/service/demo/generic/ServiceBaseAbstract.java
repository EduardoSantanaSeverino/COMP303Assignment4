package com.example.service.demo.generic;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 7, 2019
 */

/**
 * This Class is an abstract class to serve as a template for 
 * all the services created in the application.
 * In this way we are implementing code reusing for services. 
 */
public abstract class ServiceBaseAbstract <T extends Entity>
{
	
	@Autowired
    GenericRepository<T> entityRepository;
	
	public ServiceBaseAbstract()
	{
		super();
	}
	
	/** 
	 * @return the list
	 */
	public List<T> getAll() {
		return entityRepository.findAll();
	}
	
	public T getItem(int id)
	{
		return entityRepository.getOne(id);
	}
	
	public void createItem(T item)
	{
		entityRepository.save(item);
	}

	public void updateItem(int id, T item) 
	{
		entityRepository.save(item);
	}

	public void deleteItem(int id) 
	{
		entityRepository.deleteById(id);
	}

}
