programa
{
	inclua biblioteca Util
	//  10. Leia uma matriz 8x 8 e escreva o maior elemento da diagonal principal e a soma dos elementos da diagonal secundaria.
	funcao inicio()
	{	
		const inteiro LIN=3, COL=3
		inteiro mat[LIN][COL]
		inteiro sum_princ = 0, sum_secun

		para(inteiro linha = 0; linha < LIN; linha++)
		{
			para(inteiro coluna = 0; coluna < COL; coluna++)
			{
				mat[linha][coluna] = Util.sorteia(0, 10)

				se(mat[linha][coluna] == mat[linha][coluna])
					sum_princ += mat[linha][coluna]
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 8, 10, 3}-{sum_princ, 9, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */