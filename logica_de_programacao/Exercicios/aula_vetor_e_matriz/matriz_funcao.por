programa
{
	inclua biblioteca Util
	
	funcao ler_matriz(inteiro mat[][])
	{
		inteiro linhas = Util.numero_linhas(mat)
		inteiro colunas = Util.numero_colunas(mat)
		para(inteiro i = 0; i < linhas; i++)
		{
			para(inteiro j = 0; j < colunas; j++)
			{
				//inteiro num
				//leia(num)
				mat[i][j] = Util.sorteia(0, 100)
			}
		}
	}

	funcao desenharMatriz(inteiro mat[][])
	{
		inteiro linhas = Util.numero_linhas(mat)
		inteiro colunas = Util.numero_colunas(mat)
		para(inteiro i = 0; i < linhas; i++)
		{
			para(inteiro j = 0; j < colunas; j++)
			{
				escreva(mat[i][j]+ " ")
			}
			escreva("\n")
		}
	}
	
	funcao inicio()
	{
		const inteiro TAM = 3
		inteiro mat1[TAM][TAM]
		inteiro mat2[4][4]
		inteiro mat3[20][50]
		inteiro mat4[3][4]

		ler_matriz(mat1)
		ler_matriz(mat2)
		ler_matriz(mat3)
		
		limpa()
		
		desenharMatriz(mat1)
		escreva("\n")
		desenharMatriz(mat2)
		escreva("\n")
		desenharMatriz(mat3)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */