programa
{
	// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.
	funcao inicio()
	{
		// Entrada de dados
		real produto1, produto2, produto3
		real comprar_produto

		escreva("Informe o valor do produto 1: ")
		leia(produto1)
		escreva("Informe o valor do produto 2: ")
		leia(produto2)
		escreva("Informe o valor do produto 3: ")
		leia(produto3)
		
		// Processamento de Dados
		se(produto1 < produto2 e produto1 < produto3)
		{
			comprar_produto = produto1
			escreva("O produto que você deve comprar é: " + comprar_produto)
			}
		senao se(produto2 < produto1 e produto2 < produto3)
		{
			comprar_produto = produto2
			escreva("O produto que você deve comprar é: " + comprar_produto)
			}
		senao se(produto3 < produto1 e produto3 < produto2)
		{
			comprar_produto = produto3
			escreva("O produto que você deve comprar é: " + comprar_produto)
			}
		
		// Saída de Dados
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */