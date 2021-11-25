package Array;
import java.util.Scanner;

public class Array2 {
	/*
 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[6];
		int somaPar=0;
		int totalImpar=0;
		
		for(int x=0;x < 6;x++) {
			System.out.println("Entre com o "+(x+1)+"º numero");
			vetor[x] = leia.nextInt();
		}
		for(int x=0;x<6;x++) { 
			if(vetor[x]%2 == 0) {
				System.out.println(vetor[x]+" é par.");
				somaPar=somaPar + vetor[x];
			}
		}
		System.out.println("\n");
		for(int x=0;x<6;x++) {
			if (vetor[x]%2 != 0) {
				System.out.println(vetor[x]+" é impar.");
				totalImpar++;
			}
		}
		System.out.println(totalImpar+" são impares");
		//System.out.println("A soma dos numeros pares é: "+somaPar);
	}

}
