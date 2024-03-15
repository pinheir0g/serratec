programa
{
	// Escreva um programa que pergunte o dia, mês e ano do aniversário de uma pessoa e diga se a data é válida ou não. 
	// Caso não seja, diga o motivo. Suponha que todos os meses têm 31 dias e que estejamos no ano de 2013.
	funcao inicio()
	{
		// Entrada de dados
		inteiro dia, mes, ano

		leia(dia, mes, ano)

		se(dia < 1 ou dia > 31)
			{
			escreva("Os mêses só possuem dias entre 1 e 31")
			}
		senao se(mes < 1 ou mes > 12)
			{
			escreva("\nOs anos só possuem meses entre 1 e 12")
			}
		senao se(ano < 1 ou ano > 2013)
			{
			escreva("\nSó é possivel ter nascido entre os anos 1 e 2013")
			}		
		senao
			{
			escreva("É uma data válida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */