package ExeciciosPOO3;

import java.text.NumberFormat;

/*
	Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.
	 */

public class Eletronico {
	private String tipo;
	private String modelo;
	private String marca;
	private int anoFabricacao;
	private int preco;
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public Eletronico(String tipo, String modelo, String marca, int anoFabricacao, int preco) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public int aumentarPreco() {
		this.preco += (this.preco / 100)*5;
		return preco;
	}
	public int diminuirPreco() {
		this.preco -= (this.preco / 100)*5;
		return preco;
	}
	void dados() {
		System.out.println(this.getTipo());
		System.out.println("Marca: "+this.getMarca());
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Fabricado em: "+this.getAnoFabricacao());
		System.out.println("Custa "+this.formatarMoeda());
		System.out.println("\n----------------------------------\n");
	}
	
	
}
