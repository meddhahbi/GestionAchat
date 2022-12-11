package com.exemple.GestionAchat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.GestionAchat.Entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
	
	
	

}
