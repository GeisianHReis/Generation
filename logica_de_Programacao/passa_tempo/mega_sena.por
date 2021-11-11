programa
{
	inclua biblioteca Util--> ut

	//// Brincadeira, aceite os numeros da mega sena
	funcao inicio()
	{
		inteiro lancamento[6],x,y,maior=0,contMaior=0,aposta[6]={25,11,33,58,22,13}/*vetor com os numeros apostados*/,sorte=1
		real somaMedia=0.0
	
		enquanto(contMaior < 6 )
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
								contMaior++//conta o numero de acertos
							}
					}
				}
		escreva("\n\nAcertou: ",contMaior," numero(s)")
		escreva("\nSorteio n: ",sorte)
		sorte++ //conta o numeros de sorteios realizados
		
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */