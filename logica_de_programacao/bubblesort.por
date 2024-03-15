programa
{
	
	funcao bubblesort()
	{
		inteiro numeros[] = {5, 1, 4, 2, 3}
		inteiro tam = 5
		para(inteiro i = 0; i < tam - 1; i++)
		{
			para(inteiro j =0; j < tam - i - 1; j++)
			{
				se(numeros[j] > numeros[j+1])
				{
					inteiro temp = numeros[j]
					numeros[j] = numeros[j+1]
					numeros[j+1] = temp
				}
			}	
		}
		para(inteiro i = 0; i < tam; i++)
		{
			escreva(numeros[i] + "")
		}
		
	}
	funcao inicio()
	{
		bubblesort()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{temp, 14, 13, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */