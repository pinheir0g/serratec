programa
{
	// 8 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
	funcao inicio()
	{
		real nota1, nota2, nota3
		real media
		escreva("Digite a nota 1:  ")
		leia(nota1)

		escreva("Digite a nota 2: ")
		leia(nota2)

		escreva("Digite a nota 3: ")
		leia(nota3)

		media = (nota1 + nota2 + nota3) / 3
		escreva("Sua média é de: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */