package com.exemple.GestionAchat.ServiceInterface;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Operateur;

public interface OperateurServiceInterface extends BaseServiceInterface<Operateur, Long>{

	
	public void assignOperateurToFacture(Long idOperateur, Long idFacture);
	
	
}
