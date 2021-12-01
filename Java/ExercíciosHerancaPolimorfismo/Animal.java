package ExercíciosHerancaPolimorfismo;
public class Animal {
	private String nome;
	private int idade;
	private String som;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public void EmitirSom() {
		System.out.println("O "+getNome()+" faz "+getSom());
	}

	public String Apresentar() {
		return "Animal\nNome = " + nome + ", idade = " + idade + ", som = " + som + "]";
	}
	
	
}
