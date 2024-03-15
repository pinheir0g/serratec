programa
{
	inclua biblioteca Util	
	/*
	 Leia uma matriz 20 x 20. 
	 Leia também um valor X. 
	 O programa deverá fazer uma busca desse valor na matriz e, ao final escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.
	*/
	funcao inicio()
	{
		const inteiro LIN = 3, COL = 3
		inteiro mat[LIN][COL]
		inteiro x
		inteiro vetor[2]
		logico found = falso

		escreva("Digite um valor: ")
		leia(x)

		para(inteiro linha=0; linha <LIN; linha++)
		{
			para(inteiro coluna=0; coluna < COL; coluna++)
			{
				mat[linha][coluna] = Util.sorteia(0, 10)
			}
		}

		para(inteiro linha=0; linha <LIN; linha++)
		{
			para(inteiro coluna=0; coluna < COL; coluna++)
			{
				se(mat[linha][coluna] == x)
				{
					vetor[0] = linha
					vetor[1] = coluna
					found = verdadeiro			
				}
			}
		}

		se(found)
			{
				escreva("A localização do valor " + x + " é: " + "(" + vetor[0] + ", " + vetor[1] + ")")
			}

		senao
		{
			escreva("Valor não encontrado")	
	}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 973; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 12, 10, 3}-{vetor, 14, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */