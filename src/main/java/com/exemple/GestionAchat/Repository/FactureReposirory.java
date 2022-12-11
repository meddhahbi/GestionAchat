package com.exemple.GestionAchat.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.Entity.Fournisseur;


public interface FactureReposirory extends BaseRepository<Facture, Long>{

	
	 List<Facture> findByFournisseur(Fournisseur fournisseur);
	
	

		@Query("SELECT count(f) from Facture f where (f.archivee=true) ")
		Integer getNbFactureValides();
	 
	 
	 
}
