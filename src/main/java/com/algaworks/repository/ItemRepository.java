package com.algaworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
