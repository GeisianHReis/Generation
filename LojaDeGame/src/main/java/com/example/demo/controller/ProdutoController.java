package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getall() {
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	@GetMapping("{id}")
	public ResponseEntity<Produto> getbyid(@PathVariable Long id){
		return produtoRepository.findById(id).map(r -> ResponseEntity.ok(r))
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<Produto> postProduto (@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	@PutMapping
	public ResponseEntity<Produto> putCategoria (@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
	}
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		produtoRepository.deleteById(id);
	}
	

}
