programa
{
	/*
	 Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino, V-vespertino ou N-noturno. 
	 Imprima a mensagem “Bom dia!”, “Boa tarde” ou  “Boa Noite” ou “Valor inválido”, conforme o caso.

	*/
	funcao inicio()
	{
		// Entrada de Dados	
		caracter turno

		escreva("Em que turno você estuda? ")
		escreva("\nM - Matutino\nV - Vespertino\nN - Noturno\n>> ")
		leia(turno)

		// Processamento de Dados
		se(turno == 'M' ou turno == 'm')
		{
			escreva("Bom dia!")
			}
		se(turno == 'V' ou turno == 'v')
		{
			escreva("Boa tarde!")
			}
		se(turno == 'N' ou turno == 'n')
		{
			escreva("Boa noite!")
			}

		// Saída de Dados
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */