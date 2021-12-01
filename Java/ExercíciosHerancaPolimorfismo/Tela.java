package ExercíciosHerancaPolimorfismo;
public class Tela {

	public static void main(String[] args) {
		Cachorro caramelo = new Cachorro();
		Cavalo areovaldo = new Cavalo();
		Preguica lola = new Preguica();
		
		lola.setNome("Lola");
		
		System.out.println(lola.Apresentar());
		
	}

}
