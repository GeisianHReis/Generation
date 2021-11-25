package ExeciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
public class Estoque {
	Scanner leia = new Scanner(System.in);
	ArrayList<String> estoque = new ArrayList();
	
	public void Adicionar() {
		System.out.println("\nInforme o produto que deseja adicionar");
		estoque.add(leia.next());
	}
	public void Remover() {
		System.out.println("\nInforme o produto que deseja remover do estoque: ");
		String pRemover= leia.next();
		if(estoque.contains(pRemover)) {
			estoque.remove(pRemover);
		}
		else {
			System.out.println("\nProduto não encontrado em estoque, "
					+ "por favor entre com um produto valido");
		}
		
	}
	public void Atualizar() {
		System.out.println("Informe o produto que deseja atualizar");
		String pRemover = leia.next();
		System.out.println("Informe o produto que deseja colocar no lugar da "+pRemover);
		String pAtualizar = leia.next();
		if(estoque.contains(pRemover)) {
			estoque.remove(pRemover);
			estoque.add(pAtualizar);
		}else {
			System.out.println(pRemover+" não encontrado no estoque!");
		}
		}
	public void ListarEstoque() {
		System.out.println("\n\n\t\tSeu estoque atual");
		System.out.println("\t\t"+estoque);
	}
}
