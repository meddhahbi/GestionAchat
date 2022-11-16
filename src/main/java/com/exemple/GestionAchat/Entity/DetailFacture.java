package com.exemple.GestionAchat.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long idDetailFacture;
	
	private Integer qteCommande;
	private float prixTotalDetail;
	private Integer pourcentageRemise;
	private float montantRemise;
	
	
	@ManyToOne
	private Facture facture;
	
	
	@ManyToOne
	private Produit produit;
	
	
	
}
