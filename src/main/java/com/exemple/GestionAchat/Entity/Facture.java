package com.exemple.GestionAchat.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.exemple.GestionAchat.Entity.Facture;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long idFacture;
	
	
	private float montantRemise;
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@Temporal(TemporalType.DATE)
	private Date dateMOdif;
	
	private boolean archivee;
	
	
	@OneToMany(mappedBy = "facture")
	private Set<DetailFacture>detailFect;
	
	
	@OneToMany(mappedBy = "facture")
	private Set<Reglement>reglement;
	
	
	@ManyToOne
	private Fournisseur fournisseur;
	
	
}
