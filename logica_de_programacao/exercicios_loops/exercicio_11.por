programa
{
	// Escreva um aplicativo que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.

	
	funcao inicio()
	{
		// Entrada de dados
		inteiro n

		escreva("Digite um número: ")
		leia(n)

		// Processamento de dados
		para(inteiro cont=1; cont<=n; cont++)
		{
			se(cont%2 == 0)
			{
				escreva("\nPar: " + cont)
			}
			senao
			{
				escreva("\nImpar: " + cont)
			}
		}
		
		// Saída de dados
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */