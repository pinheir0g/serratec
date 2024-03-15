programa
{
	// Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”. 
	// Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido
	funcao inicio()
	{
		// Entrada de dados
		caracter letra

		escreva("Digite F ou M: ")
		leia(letra)
		
		// Processamento e Saída de Dados
		se(letra == 'F' ou letra == 'f')
			{
			escreva("A letra digitada é F - Feminino")
			}
		senao se(letra == 'M' ou letra == 'm')
			{
			escreva("A letra digitada é M - Masculino")
			}
		senao
			{
			escreva("Sexo inválido")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */