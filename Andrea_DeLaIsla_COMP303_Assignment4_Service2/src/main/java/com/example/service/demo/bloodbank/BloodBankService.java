package com.example.service.demo.bloodbank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bloodBankService")
public class BloodBankService {
	
	@Autowired
	private BloodBankRepository bloodBankRepository;
	
	public BloodBank getItem(int id) {
		return this.bloodBankRepository.getOne(id);
	}

	public List<BloodBank> getAll() {
		return this.bloodBankRepository.findAll();
	}

	public void updateItem(int id, BloodBank item) {
	   item.setId(id);
	   this.bloodBankRepository.save(item);
	}

	public void createItem(BloodBank item) {
		this.bloodBankRepository.save(item);
	}

	public void deleteItem(int id) {
		this.bloodBankRepository.deleteById(id);
	}
}
