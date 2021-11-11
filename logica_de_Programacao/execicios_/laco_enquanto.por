programa
{
	inclua biblioteca Util--> ut

	/*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
	 */
	
	//25,11,33,58,22,13
	funcao inicio()
	{
		inteiro lancamento[10],x,y,maior=0,contMaior=0,aposta[6]={25,11,33,58,22,13},sorte=1
		real somaMedia=0.0
	
		enquanto(contMaior < 5 )
		{
			contMaior = 0
			para(x=0;x<6;x++)
				{
				lancamento[x] = ut.sorteia(1, 60)
				escreva("\n",lancamento[x])
				}
			para(x=0;x<6;x++)
				{
				para(y=0;y<6;y++)
					{
						se(lancamento[x] == aposta[y])
							{
								contMaior++
							}
					}
				}
		escreva("\n\nAcertou: ",contMaior," numero(s)")
		escreva("\nSorteio n: ",sorte)
		sorte++
		
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */