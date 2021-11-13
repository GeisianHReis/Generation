package ExeciciosPOO1;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
	public class Cliente {
	private String nome;
	private String cpf,cel;
	private String email;
	private int qntCompra=0;
	private boolean credito;
	

	public Cliente(String m, String cpf, String cel, String email, int qnt)
	{
		this.setNome(m);
		this.setCpf(cpf);
		this.setCel(cel);
		this.setEmail(email);
		this.setQntCompra(qnt);
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCel() {
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

	private static String formato(Object cpf) {
    MaskFormatter formatoCPF;
    try {
        formatoCPF = new MaskFormatter("###.###.###-##");
        formatoCPF.setValueContainsLiteralCharacters(false);
        
        return formatoCPF.valueToString(cpf);
        
        
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
	
	void dados()
	{
		System.out.println("Cliente: "+this.getNome()+"\nCPF: "+formato(this.getCpf())+"\nE-mail: "+this.getEmail()+"\nCelular: "+
				this.getCel()+"\nO cliente já comprou: "+this.getQntCompra()+
				" item(ns)\nEle tem credito na loja? "+this.getCredito());
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
