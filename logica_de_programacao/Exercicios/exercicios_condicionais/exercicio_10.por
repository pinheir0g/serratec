programa
{
	// Faça um programa que peça dois números ao usuário e mostre qual o maior e qual o menor.
	funcao inicio()
	{
		inteiro numero1, numero2

		escreva("Digite dois números: ")
		leia(numero1, numero2)

		se(numero1 > numero2)
		{
			escreva("O maior número é: " + numero1)
			}
		senao
		{
			escreva("O maior número é: " + numero2)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */