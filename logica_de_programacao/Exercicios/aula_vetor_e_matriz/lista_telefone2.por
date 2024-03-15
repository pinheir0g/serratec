programa
{	
	// Lista telefonica com opções de:
	// 1 - Cadastrar
	// 2 - Buscar 
	// 3 - Encerrar
	
	funcao inicio()
	{
		const inteiro LIN=2, COL=2
		cadeia lista[LIN][COL]	
		inteiro opcao

		enquanto(verdadeiro)
		{
			faca{
				escreva("Escolha uma opção: ")
				leia(opcao)
			}enquanto(opcao != 1 e opcao != 2 e opcao !=3)
	
			escolha(opcao)
			{
				caso 1:
					para(inteiro linha=0; linha<LIN; linha++)
					{
						escreva("Qual nome do contato: ")
						leia(lista[linha][0])
			
						escreva("Qual o telefone: ")
						leia(lista[linha][1])

						limpa()
					}
				pare
				caso 2:
					cadeia nome
					escreva("Qual nome: ")
					leia(nome)
					
					para(inteiro linha=0; linha<LIN; linha++)
					{
						se(lista[linha][0] == nome)
							escreva("O tel dele(a) é: " + lista[linha][1] + "\n")	
					}
				pare

				caso 3:
					
			
			}
		se(opcao == 3)
		{
			escreva("Encerrando...")
			pare
		}
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 855; 
 * @DOBRAMENTO-CODIGO = [23, 39];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */