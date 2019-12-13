package com.example.service.demo.seeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("seekerService")
public class SeekerService {

	@Autowired
	private SeekerRepository seekerRepository;
	
	public Seeker getItem(int id) {
		return this.seekerRepository.getOne(id);
	}

	public List<Seeker> getAll() {
		return this.seekerRepository.findAll();
	}

	public void updateItem(int id, Seeker item) {
	   item.setId(id);
	   this.seekerRepository.save(item);
	}

	public void createItem(Seeker item) {
		this.seekerRepository.save(item);
	}

	public void deleteItem(int id) {
		this.seekerRepository.deleteById(id);
	}
	
}
