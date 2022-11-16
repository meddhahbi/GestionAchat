package com.exemple.GestionAchat.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.Operateur;
import com.exemple.GestionAchat.Entity.Produit;
import com.exemple.GestionAchat.Entity.Stock;
import com.exemple.GestionAchat.ServiceInterface.OperateurServiceInterface;
import com.exemple.GestionAchat.ServiceInterface.ProduitServiceInterface;



@Service
public class ProduitServiceImp extends BaseServiceImp<Produit,Long> implements ProduitServiceInterface{

	
	
	@Autowired
	  private StockServiceImp stockService ;

	@Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
		 Produit produit = this.retrieve(idProduit);
		 Stock stock = stockService.retrieveStock(idStock);
		 System.out.println(stock);
		 
		 if(produit !=null && stock != null)
	        {
			 produit.setStock(stock);
	            this.add(produit);
	        }
	}
	
	
	
	
}
