package java1;

import java.util.Scanner;

	// Faça um programa que receba três inteiros e diga qual deles é o maior.
	

public class java1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,x;
		
		
		System.out.println("\nEntre com o primeiro numero: ");
		n1 = leia.nextInt();//10
		System.out.println("\nEntre com o segundo numero: ");
		n2 = leia.nextInt();//5
		System.out.println("\nEntre com o segundo numero: ");
		n3 = leia.nextInt();//3
		
		if(n1 > n2 && n1 > n3)
		{
			x = n1;
		}
		else if(n2 > n1 && n2 > n3)
		{
			x = n2;
		}
		else 
		{
			x = n3;
		}
		
		System.out.println("O maior numero digitado foi: "+x);
	}

}
