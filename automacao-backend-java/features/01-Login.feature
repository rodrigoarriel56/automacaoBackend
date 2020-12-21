# language: pt
# encoding UTF-8

@backend
Funcionalidade: Realizar Login

  @login @regressivo
  Esquema do Cenario: Realizar login na aplicação
    Dado que informo os dados de login <email> <password>
    Quando envio uma requisição POST para "hml" "login"
    Então o código de resposta é <statusCode>
    
    Exemplos:
      | email                |   password   | statusCode |
      | "eve.holt@reqres.in" | "cityslicka" |    404     |
