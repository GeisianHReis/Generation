programa
{
	/*
	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
	 */
	funcao inicio()
	{
		real matriz[3][3], soma=0.0, somaDia = 0.0
		inteiro linha, coluna, x=1

		para(linha=0;linha<3;linha++)
			{
				para(coluna=0;coluna<3;coluna++)
					{
						escreva("\nEntre com ",x," º numero: ")
						leia(matriz[linha][coluna])
						soma+=matriz[linha][coluna]
						//se(matriz[linha][coluna] == matriz[linha][0])
						x++
					}
		
			}
		para(x=0;x<3;x++)
			{
				somaDia+=matriz[x][x]	
			}
		escreva("\n\nA soma de todos os valores da matriz foi: ",soma)
		escreva("\nA soma da diagonal principal foi: ",somaDia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 7, 6}-{soma, 10, 21, 4}-{somaDia, 10, 31, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */