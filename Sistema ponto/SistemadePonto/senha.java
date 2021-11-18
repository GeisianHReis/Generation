package SistemadePonto;

import java.util.ArrayList;
import java.util.Scanner;

public class senha {
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int op;
		
		System.out.println("Digite sua matricula: ");
		Validador.setUsuario(leia.next());
		Validador.validadorMatricula();
		
		while(Validador.getUsuarioOK() != true)
		{
			System.out.println("Matricula não encontrada digite sua matricula novamente: ");
			Validador.setUsuario(leia.next());
			Validador.validadorMatricula();
		}
		
		System.out.println("Usuario: "+Validador.getUsuarioOK());

		
		do {
			System.out.println("\n\t\tOlá, funcionario "+Validador.getUsuario());
			System.out.println("\n(1) Iniciar jornada de trabalho");
			System.out.println("\n(2) Encerrar jornada de trabalho");
			System.out.println("\nDigite a sua opção: ");
			
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				
				System.out.println("--------------------------------------------------------------------");
				ControleJornada.IniciarJ();
				System.out.println("--------------------------------------------------------------------");
				
				break;
			case 2:
				
				System.out.println("--------------------------------------------------------------------");
				ControleJornada.EncerrarJ();
				System.out.println("--------------------------------------------------------------------");
				
				break;
			default:
				System.out.println("Dados inválidos. . .");
			}
			
		}while(op!=3);
		
	}
}


/*
long usua;

Scanner leia = new Scanner(System.in);
//Validador v1 = new Validador();
String matricula,senha;
boolean usuarioOK=false;
String usuario[][] = {{"1","001","123"},{"2","002","321"}};
int coluna,linha;

System.out.println("Digite sua matricula: ");
matricula = leia.next();
validadorMatricula(usuarioOK);

for(coluna=0;coluna<2;coluna++) {
	for(linha=0;linha<3;linha++) {
		if(usuario[coluna][linha] == matricula) {
			System.out.println("Entre com a senha: ");
			senha = leia.next();
		if(usuario[coluna][2] == senha) {
			System.out.println("Login realizado com sucesso!!!");
		}
		}
	}
	
	
	System.out.println("fim");
}
*/