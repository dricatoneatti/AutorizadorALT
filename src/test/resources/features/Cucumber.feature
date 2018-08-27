# language: pt

Funcionalidade: Testes Automatizados Release 18-4

  Cenario: Realizar consulta de um cliente por cartão
    Dado Que o Tsprime seja inicializado
    E o usuário "cl7496_43947451873" e a senha "Cog@2021"
    Quando Iniciar a procura de um cliente pelo número do cartão
    Então A consulta por catão foi realizada com sucesso e os dados do cliente foram apresentados

  Cenario: Realizar consulta de um cliente por CPF
    Dado Que o usuário "cl7496_43947451873" e a senha "Cog@2021"
    Quando Iniciar a procura de um cliente pelo número do CPF
    Então A consulta pelo CPF foi realizada com sucesso e os dados do cliente foram apresentados