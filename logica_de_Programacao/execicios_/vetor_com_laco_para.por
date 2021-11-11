programa
{
	inclua biblioteca Util --> ut

	/*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
	 */
	
	funcao inicio()
	{
		inteiro lancamento[10],x,y,maior=0,contMaior=0
		real somaMedia=0.0

		para(x=0;x<10;x++)
			{
				lancamento[x] = ut.sorteia(1, 6)
				escreva("\nO ",x+1,"º numero soteador foi:",lancamento[x])
				somaMedia+=lancamento[x]
				se (maior <= lancamento[x])
					{
						maior = lancamento[x]
					}	
			}
		para(y=0;y<10;y++)
			{
				se(maior == lancamento[y])
				{
					contMaior++
				}
			}
		escreva("\n\nO maior numero sorteado foi o ",maior," e foi soteado ",contMaior," vezes")
		escreva("\nA média de todos os numeros soteados foi: ",somaMedia/10)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */