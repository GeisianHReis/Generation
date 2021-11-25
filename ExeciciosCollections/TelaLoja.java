package ExeciciosCollections;

import java.util.Scanner;

public class TelaLoja extends Estoque{

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Estoque e1 = new Estoque();
		int op;
		do {
		System.out.println("-------------------------------");
		System.out.println("(1).Adicionar item ao estoque");
		System.out.println("(2).Remover item do estoque");
		System.out.println("(3).Atualizar item do estoque");
		System.out.println("(4).Listar itens do estoque");
		System.out.println("(5). Sair do sistema");
		System.out.println("-------------------------------");
		System.out.println("Digite a opção desejada: ");
		op = leia.nextInt();
		switch(op) {
		case 1:
			e1.Adicionar();
			break;
		case 2:
			e1.Remover();
			break;
		case 3:
			e1.Atualizar();
			break;
		case 4:
			e1.ListarEstoque();
			break;
		}
		}while(op != 5);

	}

}
