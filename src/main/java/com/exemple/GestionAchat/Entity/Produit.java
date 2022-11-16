package com.exemple.GestionAchat.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long idOperateur;
	
	
	private String codeProduit;
	private String libelleProduit;
	private float prix;
	
	
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	

	@Temporal(TemporalType.DATE)
	private Date dateDernierModif;
	
	
	@ManyToOne
	private CategoryProduit catProd;
	
	
	@ManyToOne
	private Stock stock;
	
	
	@OneToMany(mappedBy ="produit")
	private Set<DetailFacture>detailFact = new HashSet<>();
	
}
