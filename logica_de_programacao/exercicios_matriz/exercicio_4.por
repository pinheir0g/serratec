programa
{
	inclua biblioteca Util	
	// Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.
	
	funcao inicio()
	{
		const inteiro LIN = 6, COL = 6
		inteiro mat[LIN][COL]
		inteiro cont = 0

		para(inteiro linha=0; linha <LIN; linha++)
		{
			para(inteiro coluna=0; coluna < COL; coluna++)
			{
				mat[linha][coluna] = Util.sorteia(0, 50)

				se(mat[linha][coluna] > 10)
				{
					cont++
				}
				
			}
		}
		escreva(cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 9, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */