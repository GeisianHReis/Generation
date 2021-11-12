package Execicios;

import java.util.Scanner;
//Faça um programa que entre com três números e coloque em ordem crescente.

public class javaCondicionalIF2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3,maior,med,menor;
		
		System.out.println("\nEntre com o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		n2 = leia.nextInt();
		if (n2 > n1)
		{
			maior = n2;
			menor = n1;
		}	
		else
		{
			maior = n1;
			menor = n2;
		}
		System.out.println("\nEntre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n3 > maior)
		{
			maior =n3;
			med = maior;
		}
		else if(n3 < menor)
		{
			med = menor;
			menor = n3;
		}
		else 
			med =n3;
		
		System.out.println("\n"+menor+" "+med+" "+maior);

		}
	}
