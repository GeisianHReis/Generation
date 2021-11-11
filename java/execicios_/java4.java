package java1;
import java.util.Scanner;

	/*
 	Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.
	*/

public class java4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		double res;
		
		System.out.println("\nEntre com o numero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{
			res = Math.pow(num,2);
			System.out.println("\nResultado: "+res);
		}
		else
		{
			res = Math.sqrt(num);
			System.out.println("\nResultado: "+res);
		}

	}

}
