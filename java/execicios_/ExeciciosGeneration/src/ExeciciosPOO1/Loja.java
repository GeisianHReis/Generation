package ExeciciosPOO1;

public class Loja {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente2.nome = ("João");
		cliente2.dados();
		cliente1.cpf = ("99999999999999");
		cliente1.cel = ("1111111111");
		cliente1.liberarCredito();
		cliente1.comprar();
		cliente1.comprar();
		cliente1.dados();
			

	}

}
