package ExeciciosPOO2;
/*
	Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 */

public class Aviao {
	
	private String modelo;
	private int nPassageiros, vMax;
	private boolean ligado;
	
	public Aviao(String modelo, int nPassageiros, int vMax) {
		this.setModelo(modelo);
		this.setnPassageiros(nPassageiros);
		this.setvMax(vMax);
		desligar();
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getnPassageiros() {
		return nPassageiros;
	}
	public void setnPassageiros(int nPassageiros) {
		this.nPassageiros = nPassageiros;
	}
	public int getvMax() {
		return vMax;
	}
	public void setvMax(int vMax) {
		this.vMax = vMax;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	void ligar() {
		this.setLigado(true);
	}
	void desligar() {
		this.setLigado(false);
	}
	void dados() {
		System.out.println("Avião: "+this.getModelo());
		System.out.println("Capacidade maxima: "+this.getnPassageiros()+" passageiros");
		System.out.println("Velocidade maxima: "+this.getvMax()+" KM/h");
		System.out.println("\n---------------------------------------------------\n");
	}
	
	
}
