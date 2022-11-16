package com.exemple.GestionAchat.ServiceImp;

import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.Operateur;
import com.exemple.GestionAchat.Entity.Produit;
import com.exemple.GestionAchat.ServiceInterface.OperateurServiceInterface;
import com.exemple.GestionAchat.ServiceInterface.ProduitServiceInterface;
@Service
public class ProduitServiceImp extends BaseServiceImp<Produit,Long> implements ProduitServiceInterface{

}
