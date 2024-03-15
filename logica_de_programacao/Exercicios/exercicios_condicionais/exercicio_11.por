programa
{
	// Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
	funcao inicio()
	{
		// Entrada de Dados
		inteiro numero1, numero2, numero3, maior, menor

		escreva("Digite 3 numeros: ")
		leia(numero1, numero2, numero3)

		// Processamento e Saída de Dados
		maior = numero1
		se(numero2 > maior)
		{
			maior = numero2
			}
		se(numero3 > maior)
		{
			maior = numero3
			}

		menor = numero1
		se(numero2 < menor)
		{
			menor = numero2
			}
		se(numero3 < menor)
		{
			menor = numero3
			}

		escreva("O maior número é: " + maior)
		escreva("\nO menor número é: " + menor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */