programa
{
	/*
	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.
	 */
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna, x=1

		para(linha=0;linha<4;linha++)
			{	
				para(coluna=0;coluna<6;coluna++)
					{
						escreva("\nEntre com o ",x,"º numero de N1: ")
						leia(n1[linha][coluna])
						x++
						
					}
			}
		x=1
		para(linha=0;linha<4;linha++)
			{
				para(coluna=0;coluna<6;coluna++)
					{
						
						escreva("\nEntre com o ",x,"º numero de N2: ")
						leia(n2[linha][coluna])
						x++
					}
			}
		para(linha=0;linha<4;linha++)
			{
				para(coluna=0;coluna<6;coluna++)
					{
						m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
						m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
					
					}
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 10, 2}-{m1, 13, 30, 2}-{m2, 13, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */