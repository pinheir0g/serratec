programa
{
	// Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente
	funcao inicio()
	{
		// Dados de entrada
		inteiro n1, n2, n3, maior=0, menor=0, meio=0
	

		leia(n1)
		leia(n2)
		leia(n3)
		// Processamento de Dados
		se(n1 > n2 e n2 > n3) 
		{
			maior = n1
			meio = n2	
			menor = n3
			}
		senao se(n1 > n2 e n2 < n3)
		{
			maior = n1
			meio = n3
			menor = n2
			}
		senao se(n2>n1 e n1 > n3)
		{
			maior = n2
			meio = n1
			menor = n3
			}
		senao se(n2>n1 e n1 < n3)
		{
			maior = n2
			meio = n3
			menor = n1
			}
		senao se(n3>n1 e n1>n2)
		{
			maior = n3
			meio = n1
			menor = n2
			}

		senao se(n3>n1 e n1<n2)
		{
			maior = n3
			meio = n2
			menor = n1
			}	
		// Saída de Dados
		escreva(menor, meio, maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */