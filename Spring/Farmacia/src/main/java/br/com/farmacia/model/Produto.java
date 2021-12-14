package br.com.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Descrição é obrigatório!")
	private String descricao;

	private int quantidade;

	private String laboratorio;

	@NotNull(message = "Preço é obrigatório!")
	@Positive(message = "Digite um valor maior do que zero")
	private BigDecimal preco;

	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
}
