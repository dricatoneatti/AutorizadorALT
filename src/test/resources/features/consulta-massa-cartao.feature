# language: pt

Funcionalidade: Parametros - Consultas

  #Massa

  @tsprime @Massa001
  Cenario: Realizar consulta de um cliente por varios cartões
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de varios clientes pelo número do cartão
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

  @tsprime @Massa002
  Cenario: Realizar consulta de um cliente pelos números das contas
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de varios clientes pelo número da conta
    Então A consulta pelo número da conta, foi realizada com sucesso e os dados do cliente foram apresentados

  #Cenários de Teste

  @tsprime @CT001
  Esquema do Cenario: Realizar a visualização da fatura de um cliente
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Realizar a visualização da fatura atual de um cartão <cartao>
    Então A fatura do cliente será apresentada com as transações

    Exemplos:
      |cartao|
      |"5300332773544211"|

  @tsprime @CT002
  Esquema do Cenario: Realizar consulta por conta
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de um cliente pelo número da conta <conta>
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

    Exemplos:
      |conta|
      |"37078186725"|

  @tsprime @CT003
  Esquema do Cenario: Realizar consulta por cartão
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

    Exemplos:
      |cartao|
      |"5300332773544211"|

  @tsprime @CT004
  Esquema do Cenario:Verificar parâmetros para parcelamento de fatura (tela visualização)
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    E Realizar os parâmetros para parcelamento de fatura
    Então O os perfis serão editados

    Exemplos:
      |cartao|
      |"4349492776947955"|