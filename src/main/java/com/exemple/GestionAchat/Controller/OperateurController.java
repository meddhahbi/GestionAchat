package com.exemple.GestionAchat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Operateur;
import com.exemple.GestionAchat.ServiceInterface.OperateurServiceInterface;
import com.exemple.GestionAchat.ServiceInterface.ProduitServiceInterface;


@RestController
@RequestMapping("/operateur")
public class OperateurController extends BaseController<Operateur, Long>{

	
	@Autowired
	private OperateurServiceInterface operService;
	
	 @PostMapping("Assigne/{idU}/{idD}")
	    private Operateur AddandAssigne(@PathVariable(value = "idOp") Long idOp, @PathVariable(value = "idF") Long idF){
		 operService.assignOperateurToFacture(idOp,idF);
	        return operService.retrieve(idOp);
	    }
	
	
	
}
