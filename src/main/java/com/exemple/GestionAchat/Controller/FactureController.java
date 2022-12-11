package com.exemple.GestionAchat.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.ServiceInterface.FactureServiceInterface;


@RestController
@RequestMapping("/facture")
public class FactureController extends BaseController<Facture, Long>{

	@Autowired
	private FactureServiceInterface factureService;
	
	
	
	
	 @GetMapping("/getByFournisseur/{idF}")
	    private List<Facture> getFactureByFournisseur(@PathVariable(value = "idF") Long idF){
	        return factureService.getFacturesByFournisseur(idF);
	    }

	
	
	 
	 @GetMapping("/getFactureValides")
	 private Integer nbFactrueValides() {
		 return factureService.getNbfactureValides();
	 }
	 
	 
}
