package ExeciciosPOO1;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Jo�o","8746123875623","000000000000","haifdif@gmail.com",2);
		Cliente c2 = new Cliente("","",null,null,1);
		c1.liberarCredito();
		c1.comprar();
		c1.comprar();
		c1.dados();
		c2.dados();
			

	}

}
