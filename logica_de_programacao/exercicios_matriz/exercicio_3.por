programa
{
	inclua biblioteca Util
	// Leia duas matrizes 4 x 4 e escreva uma terceira com os 4 maiores elementos entre as primeiras
	funcao inicio()
	{	
		const inteiro LIN = 4, COL = 4
		inteiro mat1[LIN][COL], mat2[LIN][COL], mat3[2][2]
		inteiro maior = -1
		inteiro vetor[4]
		

		para(inteiro linha=0; linha <LIN; linha++)
		{
			para(inteiro coluna=0; coluna < COL; coluna++)
			{
				mat1[linha][coluna] = Util.sorteia(0, 10)
				mat2[linha][coluna] = Util.sorteia(0, 10)
			}
		}
		
		para(inteiro linha=0; linha <4; linha++)
		{
			para(inteiro coluna=0; coluna < 4; coluna++)
			{
		
				se(mat1[linha][coluna] > maior)
				{
					maior = mat1[linha][coluna]
					vetor[0] = linha
					vetor[1] = coluna					
	
				}	
			
			}		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat1, 8, 10, 4}-{mat2, 8, 26, 4}-{mat3, 8, 42, 4}-{maior, 9, 10, 5}-{vetor, 10, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */