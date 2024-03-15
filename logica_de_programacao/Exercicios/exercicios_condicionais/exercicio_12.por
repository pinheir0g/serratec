programa
{
	// Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. 
	// Use alguns dos operadores lógicos OU e E.
	funcao inicio()
	{
		// Entrada de dados
		inteiro idade

		escreva("Digite a sua idade: ")
		leia(idade)

		// Processamento de Dados
		se(idade >= 18 e idade <=67)
		{
			escreva("Você pode doar sangue")
			}
		senao
			{
			escreva("Você não pode doar sangue")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */