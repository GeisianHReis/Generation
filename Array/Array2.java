package Array;
import java.util.Scanner;

public class Array2 {
	/*
 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[6];
		int somaPar=0;
		int totalImpar=0;
		
		for(int x=0;x < 6;x++) {
			System.out.println("Entre com o "+(x+1)+"� numero");
			vetor[x] = leia.nextInt();
		}
		for(int x=0;x<6;x++) { 
			if(vetor[x]%2 == 0) {
				System.out.println(vetor[x]+" � par.");
				somaPar=somaPar + vetor[x];
			}
		}
		System.out.println("\n");
		for(int x=0;x<6;x++) {
			if (vetor[x]%2 != 0) {
				System.out.println(vetor[x]+" � impar.");
				totalImpar++;
			}
		}
		System.out.println(totalImpar+" s�o impares");
		//System.out.println("A soma dos numeros pares �: "+somaPar);
	}

}
