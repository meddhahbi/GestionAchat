package com.exemple.GestionAchat.ServiceImp;

import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.Produit;
import com.exemple.GestionAchat.Entity.Reglement;
import com.exemple.GestionAchat.ServiceInterface.ProduitServiceInterface;
import com.exemple.GestionAchat.ServiceInterface.ReglementServiceInterface;
@Service
public class ReglementServiceImp extends BaseServiceImp<Reglement,Long> implements ReglementServiceInterface{

}
