programa
{
	//  Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.
	funcao inicio()
	{
		// Entrada de dados
		inteiro numero
		inteiro cont = 1
		inteiro tab 
		
		escreva("Digite um número: ")
		leia(numero)

		// Processamento e Saída de dados
		para(cont; cont <=10; cont++)
		{
			tab = numero * cont
			escreva(numero + "x" + cont + "=" + tab + "\n")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */