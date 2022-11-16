package com.exemple.GestionAchat.ServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.Entity.Operateur;
import com.exemple.GestionAchat.Entity.Produit;
import com.exemple.GestionAchat.Entity.Stock;
import com.exemple.GestionAchat.ServiceInterface.CategoryProduitInterface;
import com.exemple.GestionAchat.ServiceInterface.OperateurServiceInterface;

@Service
public class OperateurServiceImp extends BaseServiceImp<Operateur,Long> implements OperateurServiceInterface{

	
	@Autowired
	  private FactureServiceImp factureService ;
	
	
	@Override
	public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
		 Operateur operateur = this.retrieve(idOperateur);
	        Facture facture = factureService.retrieve(idFacture);
	        List<Facture> sd = new ArrayList<>() ;
	        System.out.println(facture);
	        if(operateur !=null && facture != null)
	        {
	            sd.add(facture);
	            operateur.setFacture(sd);
	            this.add(operateur);
	        }
		 
		 
	}

}
