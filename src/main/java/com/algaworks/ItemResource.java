package com.algaworks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.repository.ItemRepository;

@RestController
public class ItemResource {

	@Autowired
	private ItemRepository intemRepository;
	
	@GetMapping("/itens")
	public List<Item> listar(){
		return intemRepository.findAll();
	}
}
