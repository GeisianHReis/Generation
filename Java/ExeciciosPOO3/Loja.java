package ExeciciosPOO3;

public class Loja {

	public static void main(String[] args) {
		Eletronico ps5 = new Eletronico("Video-Game","ps5-500Gb","Sony",2021,3500);
		ps5.dados();
		ps5.aumentarPreco();
		ps5.dados();
		ps5.diminuirPreco();
		ps5.diminuirPreco();
		ps5.dados();
	}

}
