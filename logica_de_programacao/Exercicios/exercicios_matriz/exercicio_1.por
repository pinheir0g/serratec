programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro mat[10][10]
		inteiro maior = -1
		inteiro localizacao[2]

		para(inteiro linha = 0; linha < 10; linha++)
		{
			para(inteiro coluna = 0; coluna < 10; coluna++)
			{
				mat[linha][coluna] = Util.sorteia(0, 100)
			}
		}

		para(inteiro linha = 0; linha < 10; linha++)
		{
			para(inteiro coluna = 0; coluna < 10; coluna++)
			{
				se(mat[linha][coluna] > maior)
				{
					maior = mat[linha][coluna]
					localizacao[0] = linha
					localizacao[1] = coluna
				}
			}
		}
		escreva("(" + localizacao[0] + ", "  + localizacao[1] + ")")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 103; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 7, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */