programa
{
	
	funcao inicio()
	{
		inteiro n

		leia(n)

		para(inteiro linha = 1; linha <= n; linha++)
		{
			se(linha == 1 ou linha == n)
			{				
				para(inteiro coluna = 1; coluna <= n; coluna++)
				{
					escreva("*")
				}
				escreva("\n")
			}
				senao
				{
					para(inteiro coluna = 1; coluna <= n; coluna++)
					{
						se(coluna == 1 ou coluna == n)
							escreva("*")
						senao
							escreva(" ")
					}
					escreva("\n")
				}			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */