package com.exemple.GestionAchat.ServiceImp;

import org.springframework.stereotype.Service;

import com.exemple.GestionAchat.Entity.CategoryProduit;
import com.exemple.GestionAchat.Entity.DetailFacture;
import com.exemple.GestionAchat.ServiceInterface.CategoryProduitInterface;
import com.exemple.GestionAchat.ServiceInterface.DetailFactureInterface;
@Service
public class DetailFactureServiceImp  extends BaseServiceImp<DetailFacture,Long> implements DetailFactureInterface{

}
