# language: pt

Funcionalidade: Parametros

@tsprime @ct001
  Cenario: Realizar consulta de um cliente por cartão
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de um cliente pelo número do cartão
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados
