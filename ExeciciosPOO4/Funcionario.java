package ExeciciosPOO4;
import java.text.NumberFormat;
/*
	Crie uma classe funcionário e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto funcionário, defina as
	instancias deste objeto e apresente as informações deste objeto no
	console.
 */

public class Funcionario {
	String nome;
	String cargo;
	int cod;
	double salario;
	
	public Funcionario(String nome, String cargo, int cod, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.cod = cod;
		this.salario = salario;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void aumentarSalario() {
		this.salario += (this.salario / 100)*4;
	}
	void diminuirSalario() {
		this.salario -= (this.salario / 100)*5;
	}
	
	void dados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Cargo: "+this.getCargo());
		System.out.println("Codigo: "+this.getCod());
		System.out.println("Salario "+this.formatarMoeda());
		System.out.println("\n------------------------------\n");
		
	}
	
	
}
