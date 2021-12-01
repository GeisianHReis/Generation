package ExeciciosPOO1;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
	public class Cliente {
	private String nome;
	private String cpf;
	private String cel;
	private String email;
	private int qntCompra=0;
	private boolean credito;
	

	public Cliente(String nome, String cpf, String cel, String email, int qnt)
	{
		this.setNome(nome);
		this.setCpf(cpf);
		this.setCel(cel);
		this.setEmail(email);
		this.setQntCompra(qnt);
	}
	
	private static String formatoCPF(String cpf) {
	    MaskFormatter formatoCPF;
	    try {
	        formatoCPF = new MaskFormatter("###.###.###-##");
	        formatoCPF.setValueContainsLiteralCharacters(false);
	        
	        return formatoCPF.valueToString(cpf);
	        
	        
	        } catch (ParseException e) {
	            throw new RuntimeException(e);
	        }
	}
	
	private static String formatoCel(String cel) {
		MaskFormatter formatoCel;
		try {
			formatoCel = new MaskFormatter("(##)#####-####");
			formatoCel.setValueContainsLiteralCharacters(false);
			
			return formatoCel.valueToString(cel);
		}catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		this.cpf = formatoCPF(this.cpf);
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCel() {
		this.cel = formatoCel(this.cel);
		return this.cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQntCompra() {
		return this.qntCompra;
	}

	public void setQntCompra(int qntCompra) {
		this.qntCompra = qntCompra;
	}

	public boolean getCredito() {
		return this.credito;
	}

	public void setCredito(boolean credito) {
		this.credito = credito;
	}
	
	void dados()
	{
		System.out.println("Cliente: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Celular: "+this.getCel());
		System.out.println("E-mail: "+this.getEmail());
		System.out.println("O clinte já comprou: "+this.getQntCompra()+" intem(ns)");
		System.out.println("Cliente tem credito: "+this.getCredito());
		System.out.println("\n\n**********************************\n\n");
	}
	void comprar()
	{	
		this.qntCompra++;
	}
	void liberarCredito()
	{
		this.credito = true;
	}
	void tirarCredito()
	{
		this.credito = false;
	}
	
	
	
}
