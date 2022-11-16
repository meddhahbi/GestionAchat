package com.exemple.GestionAchat.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemple.GestionAchat.Entity.Stock;

import com.exemple.GestionAchat.ServiceInterface.StorckServiceInterface;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private StorckServiceInterface stockService;
	
	
	
	@GetMapping()
	public List<Stock>etudiants(){
		
		return stockService.retrieveAllStock();
		
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Stock> addEtudiant(@RequestBody Stock stock){
		
		return ResponseEntity.ok(this.stockService.addStock(stock));
		
		
	}
	
	
	
	@PutMapping("/update")
	public ResponseEntity<Stock>update(@RequestBody Stock stock){
		
		return ResponseEntity.ok(this.stockService.updateStock(stock));
	
		
	}
	
	
	@GetMapping("/{id}")
	public Stock etudiant (@PathVariable("id") Long id) {
		
		return this.stockService.retrieveStock(id);
		
	}
	
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
			
		this.stockService.removeStock(id);
		
	}

	
	
	
	
}
