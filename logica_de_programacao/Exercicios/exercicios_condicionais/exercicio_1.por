programa
{
	// Faça um programa que peça dois números e verifique usando (if e else) qual o maior deles e imprima na tela
	funcao inicio()
	{
		// Entrada de Dados
		inteiro numero1, numero2

		escreva("Digite o primeiro número: ")
		leia(numero1)

		escreva("Digite o segundo número: ")
		leia(numero2)

		// Processamento e Saída de Dados
		se(numero1 > numero2)
			{
			escreva("O maior número digitado foi: " + numero1)
			}

		senao
			{ 
			escreva("O maior número digitado foi: " + numero2)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */