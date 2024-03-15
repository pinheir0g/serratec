programa
{
	inclua biblioteca Util
	
	//Lista de contatos com: Nome e telefone
	//1 - Cadastrar
	//2 - Buscar
	//3 - Listar
	//4 - Editar um contato

	funcao exibirMenu()
	{
		escreva("\n\nLista de contatos")
		escreva("\n1 - Cadastrar")
		escreva("\n2 - Buscar")
		escreva("\n3 - Listar todos")
		escreva("\n4 - Editar")
		escreva("\n5 - Sair")
		escreva("\n\nEscolha uma opcao: ")
	}

	funcao cadastrarContato(cadeia listaDeContato[][])
	{
		inteiro linhas = Util.numero_linhas(listaDeContato)
		para(inteiro i=0; i<linhas; i++)
		{
			cadeia nome, telefone
			caracter parar						
			escreva("Nome: ")
			leia(nome)
			
			escreva("Telefone: ")
			leia(telefone)
			
			listaDeContato[i][0] = nome
			listaDeContato[i][1] = telefone
	
			escreva("Deseja parar? ")
			leia(parar)
	
			se(parar == 'S' ou parar == 's')
				pare
		}		
	}

	funcao cadeia buscarContato(cadeia listaDeContato[][])
	{		
		inteiro linhas = Util.numero_linhas(listaDeContato)
		limpa()
		cadeia nome
		escreva("Qual nome do contato: ")
		leia(nome)
		
		para(inteiro i=0; i<linhas; i++)
		{
			se(listaDeContato[i][0] == nome)
			{
				retorne listaDeContato[i][0] + " - " + listaDeContato[i][1]
			}
		}

		retorne "Não foi encontrado esse contato"
	}
	
	funcao inicio()
	{
		const inteiro LIN = 3, COL = 2
		inteiro opcao
		cadeia lista[LIN][COL]
		logico fimPrograma = falso

		enquanto(nao fimPrograma)
		{
			
			faca{
				exibirMenu()
				leia(opcao)
			}enquanto(opcao < 1 ou opcao > 6)

			escolha(opcao)
			{
				caso 1://Cadastro
					cadastrarContato(lista)
					pare
				caso 2://Buscar
					cadeia mensagem = buscarContato(lista)
					escreva(mensagem)
					pare
				
				caso 3://Listar Todos
					limpa()
					para(inteiro i=0; i<LIN; i++)
					{
						se(lista[i][0] != "")
						{
							escreva("\n\nNome: " + lista[i][0])
							escreva("\nTelefone: " + lista[i][1])
							escreva("\n")
						}
					}
					pare

				caso 4://Editar
					limpa()
					cadeia nomePesquisa
					escreva("Qual nome do contato: ")
					leia(nomePesquisa)
					
					para(inteiro i=0; i<LIN; i++)
					{
						se(lista[i][0] == nomePesquisa)
						{
							cadeia nomeEdicao, telefoneEdicao
							escreva("Nome: ")
							leia(nomeEdicao)
							
							escreva("Telefone: ")
							leia(telefoneEdicao)
						
							lista[i][0] = nomeEdicao
							lista[i][1] = telefoneEdicao
						}						
					}
					pare
				
				caso 5:
					fimPrograma = verdadeiro
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
 * @POSICAO-CURSOR = 2117; 
 * @DOBRAMENTO-CODIGO = [10, 21, 45];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {listaDeContato, 22, 32, 14}-{lista, 69, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */