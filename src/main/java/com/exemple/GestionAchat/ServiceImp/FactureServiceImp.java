package com.exemple.GestionAchat.ServiceImp;

import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.Facture;
import com.exemple.GestionAchat.ServiceInterface.CategoryProduitInterface;
import com.exemple.GestionAchat.ServiceInterface.FactureServiceInterface;
@Service
public class FactureServiceImp extends BaseServiceImp<Facture,Long> implements FactureServiceInterface{

}
