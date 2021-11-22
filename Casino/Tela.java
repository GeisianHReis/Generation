package Casino;
import java.util.Random;
import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		Random gerar = new Random();
		Scanner leia = new Scanner(System.in);
		int res1 = 0;
		int res2 = 0;
		int nApostado = 0 ;
		int op=0;
		
		while(op !=5) {
		System.out.println("-------Bemvindo--------");
		System.out.println("\tEscolha um jogo");
		System.out.println("\t(1) Dados");
		System.out.println("(5) Sair");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			res1 = gerar.nextInt(5)+1;
			res2 = gerar.nextInt(5)+1;
			System.out.println("\nEm qual numero deseja apostar? ");
			nApostado = leia.nextInt();
			System.out.println("\n"+res1);
			System.out.println(res2);
			if (res1 == nApostado || res2 == nApostado) {
				System.out.println("\nVocê ganhou.");
			}		
		}
		}
	}
}
