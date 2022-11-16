package com.exemple.GestionAchat.Repository;

import java.util.List;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.Entity.Fournisseur;


public interface FactureReposirory extends BaseRepository<Facture, Long>{

	
	 List<Facture> findByFournisseur(Fournisseur fournisseur);
	
	
}
