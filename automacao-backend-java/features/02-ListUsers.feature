# language: pt
# encoding UTF-8

@backend
Funcionalidade: Realizar Login

@listaUsuario @regressivo
Esquema do Cenario: Realizar a busca de usuário
	Dado envio uma requisição GET para "hml" "listUsers"
	Então o código de resposta é <statusCode>
	
		
    Exemplos:
      | email | password | statusCode |
      | "" 		| "" 			 | 200        |
		
	 
  