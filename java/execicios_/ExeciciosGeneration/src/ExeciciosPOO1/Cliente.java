package ExeciciosPOO1;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
	public class Cliente {
	public String nome;
	public String cpf,cel;
	public String email;
	public int qntCompra=0;
	public boolean credito;
	
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
		System.out.println("Cliente: "+nome+"\nCPF: "+formato(cpf)+"\nE-mail: "+email+"\nCelular: "+cel+"\nO cliente já comprou: "+qntCompra+
				" item(ns)\nEle tem credito na loja? "+credito);
		System.out.println("\n\n**********************************\n\n");
	}
	void comprar()
	{	
		qntCompra++;
	}
	void liberarCredito()
	{
		credito = true;
	}
	void tirarCredito()
	{
		credito = false;
	}
	
	
	
}
