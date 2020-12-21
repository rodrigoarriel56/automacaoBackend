# language: pt
# encoding UTF-8

@backend
Funcionalidade: Apresenta lista de usuários

@listaUsuario @regressivo
Esquema do Cenario: Realizar a busca de usuário
	Dado envio uma requisição GET para "hml" <id>
	Então o código de resposta é <statusCode>
	
		
    Exemplos:
      | id  	| first_name | last_name   | statusCode |
      | "7" 	| "Michael"	 | "Lawson"    | 		404			|
      | "8" 	| "Lindsay"	 | "Ferguson"  | 		404			|
		
	 
  