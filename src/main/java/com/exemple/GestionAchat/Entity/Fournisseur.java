package com.exemple.GestionAchat.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fournisseur {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long idFournisseur;
	
	private String codeFournisseur;
	private String libelleFournisseur;
	private CategorieFournisseur catFournisseur;
	
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur cat;
	
	@OneToOne
    private DetailFournisseur detailFournisseur;
	
	
	@OneToMany(mappedBy = "fournisseur")
	private Set<Facture>factures;
	
	
	
	
	
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<SecteurActivite>secteur = new HashSet<>();
}
