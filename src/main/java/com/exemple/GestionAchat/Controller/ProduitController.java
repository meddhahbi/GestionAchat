package com.exemple.GestionAchat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Produit;
import com.exemple.GestionAchat.ServiceInterface.ProduitServiceInterface;


@RestController
@RequestMapping("/produit")
public class ProduitController extends BaseController<Produit, Long>{

	
	@Autowired
	private ProduitServiceInterface produitService;
	
	
	
	
	   @PostMapping("assigne/{idP}/{idS}")
	    private Produit AssigneProduitToStock(@PathVariable(value = "idP") Long idP,@PathVariable(value = "idS") Long idS){
		   produitService.assignProduitToStock(idP,idS);
	        return produitService.retrieve(idP) ;
	    }
	
	
}
