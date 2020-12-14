# language: pt
# encoding UTF-8

@backend
Funcionalidade: Realizar Login

@listaUsuario
Esquema do Cenario: Realizar a busca de lista de usuário
	Dado que eu esteja na tela de busca de usuário
	Quando envio uma requisição POST para "hml" "listUsers"
	Então o código de resposta é <statusCode>
	
		
    Exemplos:
      | email | password | statusCode |
      | "" 		| "" 			 | 200        |
		
	 
  