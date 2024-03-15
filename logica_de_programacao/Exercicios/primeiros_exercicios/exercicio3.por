programa
{
	// 3 - Faça um algoritmo que peça ao usuário dois números e retorne a soma, subtração, multiplicação e divisão desses dois valores.
	funcao inicio()
	{
		real numero1
		real numero2
		real sum, sub, mult, div

		escreva("-----Calculadora Serratec-----")
		escreva("\nDigite o primeiro número: ")
		leia(numero1)

		escreva("Digite o segundo número: ")
		leia(numero2)
		

		// 2 - Processamento de dados
		sum = numero1 + numero2
		sub = numero1 - numero2
		div = numero1 / numero2
		mult = numero1 * numero2


		// 3 -  Saída de dados
		escreva("O resultado da soma dos dois número é igual: " + sum)
		escreva("\nO resultado da subtração dos dois número é igual: " + sub)
		escreva("\nO resultado da divisão dos dois número é igual: " + div)
		escreva("\nO resultado da multiplicação dos dois número é igual: " + mult)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 843; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */