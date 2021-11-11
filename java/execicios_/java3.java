package java1;
import java.util.Scanner;
	/*
	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto
	 */
public class java3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0;
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		switch(idade)
		{
		case 10: case 11: case 12: case 13: case 14:
			System.out.println("\nInfatil");
			break;
		case 15: case 16: case 17:
			System.out.println("\nJuvenil");
			break;
		case 18: case 19: case 20: case 21: case 22:
		case 23: case 24: case 25:
			System.out.println("\nAdulto");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
		}
		
		
	}
	}


