package ExeciciosPOO2;
/*
	Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
 */

public class Aviao {
	public String modelo,estado;
	public int nPassageiros, vMax;
	public boolean ligado;
	
	void ligar()
	{
		ligado = true;
	}
	void desligar()
	{
		ligado = false;
	}
	void dados()
	{
		if(ligado == true)
		{
			estado = ("Ligado");
		}
		else
			estado = ("Delisgado");
		System.out.println("O avi�o "+modelo+" tem uma velocidade maxima de "+vMax+" km(h), com uma capacidade de "+nPassageiros+
				" passageiros. Atualmente esta: "+estado);
	}	
}
