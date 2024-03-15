programa
{
	// Faça um Programa que leia um número e exiba o dia correspondente da semana. 
	// (1- Domingo, 2- Segunda, etc.) se digitar outro valor deve aparecer “valor inválido).
	funcao inicio()
	{
		// Entrada de dados
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)
		
		// Processamento e Saída de Dados
		se(numero == 1)
		{
			escreva("1 - Domingo")
			}
		senao se(numero == 2)
		{
			escreva("2 - Segunda")
			}
		senao se(numero == 3)
		{
			escreva("3 - Terça")
			}	
		senao se(numero == 4)
		{
			escreva("4 - Quarta")
			}	
		senao se(numero == 5)
		{
			escreva("2 - Quinta")
			}	
		senao se(numero == 6)
		{
			escreva("2 - Sexta")
			}
		senao se(numero == 7)
		{
			escreva("2 - Sábado")
			}
		senao
		{
			escreva("Valor inválido!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */