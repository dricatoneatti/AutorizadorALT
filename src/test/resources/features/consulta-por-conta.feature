# language: pt

Funcionalidade: Parametros

  @tsprime @ct002
  Cenario: Realizar consulta de um cliente pelo número da conta
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de um cliente pelo número da conta
    Então A consulta pelo número da conta, foi realizada com sucesso e os dados do cliente foram apresentados