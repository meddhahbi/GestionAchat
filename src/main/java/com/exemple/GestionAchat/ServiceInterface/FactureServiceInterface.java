package com.exemple.GestionAchat.ServiceInterface;

import java.util.List;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;

public interface FactureServiceInterface extends BaseServiceInterface<Facture, Long>{

	
	
	List<Facture> getFacturesByFournisseur(Long idFournisseur);
	
	Integer getNbfactureValides();
	
}
