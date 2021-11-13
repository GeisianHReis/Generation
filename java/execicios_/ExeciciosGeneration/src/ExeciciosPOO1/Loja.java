package ExeciciosPOO1;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("João","8746123875623","11967321234","joao@gmail.com",2);
		Cliente c2 = new Cliente("","",null,null,0);
		c1.liberarCredito();
		c1.comprar();
		c1.comprar();
		c1.dados();
		c2.dados();
			

	}

}
