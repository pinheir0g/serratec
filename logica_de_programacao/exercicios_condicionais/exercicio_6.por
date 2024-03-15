programa
{
	/*
	 Faça um programa para a leitura de duas notas parciais de um aluno, e imprima:	
	 - A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
	 - A mensagem “Aprovado com Distinção”, se a média for igual a dez;
	 - A mensagem “Reprovado” se a média for menor de do que sete;

	*/
	funcao inicio()
	{
		// Entrada de dados
		real nota1, nota2, media

		escreva("Digite a sua primeira nota: ")
		leia(nota1)

		escreva("Digite a sua segunda nota: ")
		leia(nota2)
		
		// Processamento de Dados
		media = (nota1 + nota2) / 2
		
		// Saída de Dados
		se(media >= 7 e media < 10)
			{
			escreva("Aprovado")
			}
		senao se(media == 10)
			{
			escreva("Aprovado com Distinção")	}

		senao se(media < 7)
			{
			escreva("Reprovado")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */