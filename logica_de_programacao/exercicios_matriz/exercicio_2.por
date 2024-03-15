programa
{
	
	funcao inicio()
	{
		inteiro mat[5][5]

		para(inteiro linha=0; linha<5; linha++)
		{
			para(inteiro coluna=0; coluna<5; coluna++)
			{
				se(linha == coluna)
				{
					mat[linha][coluna] = 1
				}
				senao
					mat[linha][coluna] = 0	
			}	
		}
		para(inteiro linha=0; linha<5; linha++)
		{
			para(inteiro coluna=0; coluna<5; coluna++)
			{
				se(coluna == 5 -1 ){
					escreva(mat[linha][coluna] + "\n" + "-----------------" + "\n")
					
				}
				senao
					escreva(mat[linha][coluna] + " | ")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */