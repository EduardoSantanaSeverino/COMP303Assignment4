package com.example.service.demo.stocks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bloodStockService")
public class BloodStockService {

	@Autowired
	private BloodStockRepository stockRepository;
	
	public BloodStock getItem(int id) {
		return this.stockRepository.getOne(id);
	}

	public List<BloodStock> getAll() {
		return this.stockRepository.findAll();
	}

	public void updateItem(int id, BloodStock item) {
	   item.setStockId(id);
	   this.stockRepository.save(item);
	}

	public void createItem(BloodStock item) {
		this.stockRepository.save(item);
	}

	public void deleteItem(int id) {
		this.stockRepository.deleteById(id);
	}
	
}
