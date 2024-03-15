programa
{
	
	funcao inicio()
	{
		real notas[15] 
		real media = 0.0


		para(inteiro i =0; i <15; i++)
		{
			escreva("Qual foi a nota do aluno " + (i + 1) + "? ")
			leia(notas[i])
		}


		media = (notas[0] + notas[1] + notas[2]) / 3
		
		escreva("A média foi: " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 7, 5}-{media, 7, 7, 5}-{i, 10, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */