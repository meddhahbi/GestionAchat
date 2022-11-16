package com.exemple.GestionAchat.ServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.Stock;
import com.exemple.GestionAchat.Repository.StockRepository;
import com.exemple.GestionAchat.ServiceInterface.StorckServiceInterface;

@Service
public class StockServiceImp implements StorckServiceInterface{

	@Autowired
	private StockRepository stockRepo;
	
	
	
	@Override
	public List<Stock> retrieveAllStock() {
		return new ArrayList<>(this.stockRepo.findAll());

	}

	@Override
	public Stock addStock(Stock s) {
		return stockRepo.save(s);

	}

	@Override
	public Stock updateStock(Stock s) {
			if(retrieveStock(s.getIdStock())!= null) 
			
			return this.stockRepo.save(s);
		
		
		return null;
	}

	@Override
	public Stock retrieveStock(Long idStock) {
		return this.stockRepo.findById(idStock).get();
	}

	@Override
	public void removeStock(Long idStock) {
		this.stockRepo.deleteById(idStock);
		
	}

}
