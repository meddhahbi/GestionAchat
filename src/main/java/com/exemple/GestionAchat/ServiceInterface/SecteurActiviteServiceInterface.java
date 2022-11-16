package com.exemple.GestionAchat.ServiceInterface;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.SecteurActivite;

public interface SecteurActiviteServiceInterface extends BaseServiceInterface<SecteurActivite, Long>{

	
	public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) ;
	
	
}
