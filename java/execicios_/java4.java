package java1;
import java.util.Scanner;

	/*
 	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.
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
