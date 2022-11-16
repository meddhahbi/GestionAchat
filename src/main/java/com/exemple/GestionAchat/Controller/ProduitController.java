package com.exemple.GestionAchat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Produit;

@RestController
@RequestMapping("/produit")
public class ProduitController extends BaseController<Produit, Long>{

}
