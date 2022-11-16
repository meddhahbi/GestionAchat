package com.exemple.GestionAchat.ServiceInterface;

import java.util.List;

import com.exemple.GestionAchat.Entity.Stock;

public interface StorckServiceInterface {

	//Done
		public List<Stock>retrieveAllStock(); 
		
		//Done
		public Stock addStock(Stock s);

		
		//Done
		public Stock updateStock (Stock s);
		
		
		
		//Done
		public Stock retrieveStock(Long idStock);
		
		
		public void removeStock(Long idStock);
		
	
	
	
}
