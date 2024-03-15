programa
{	
		// Faça uma lista de contatos de 5 pessoas utilizando matriz
		// 0 - nome
		// 1 - telefone
	
	funcao inicio()
	{
		const inteiro LIN=5, COL=2
		cadeia lista[LIN][COL]

		para(inteiro linha=0; linha<LIN; linha++)
		{
			escreva("Qual nome do contato: ")
			leia(lista[linha][0])

			escreva("Qual o telefone: ")
			leia(lista[linha][1])
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lista, 10, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */