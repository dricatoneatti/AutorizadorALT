# language: pt

Funcionalidade: : Parametros

@tsprime @ct003
  Cenario: Verificar a visualização de uma fatura
  Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
  Quando Iniciar a procura de um cliente pelo número de um cartão
  E Realizar a visualização da fatura
  Então A fatura do cliente pesquisado será apresentada