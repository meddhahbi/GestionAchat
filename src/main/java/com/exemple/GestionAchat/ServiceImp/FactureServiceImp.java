package com.exemple.GestionAchat.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.Entity.Fournisseur;
import com.exemple.GestionAchat.Repository.FactureReposirory;
import com.exemple.GestionAchat.ServiceInterface.CategoryProduitInterface;
import com.exemple.GestionAchat.ServiceInterface.FactureServiceInterface;

@Service
public class FactureServiceImp extends BaseServiceImp<Facture,Long> implements FactureServiceInterface{

	
	@Autowired
	private FactureReposirory factureRepo;
	
	
	  @Autowired
	  private FournisseurServiceImp fournisseurService ;
	
	
	
	@Override
	public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
		/*Fournisseur fournisseur = fournisseurService.retrieve(idFournisseur);
        if(fournisseur != null)
        {
           return factureRepo.(fournisseur);
        }*/
	return null;
	}

}
