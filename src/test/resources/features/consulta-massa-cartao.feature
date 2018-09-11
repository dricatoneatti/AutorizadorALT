# language: pt

Funcionalidade: Parametros - Consultas

  #Massa

  @tsprime @Massa001
  Cenario: Realizar consulta de um cliente por varios cartões
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de varios clientes pelo número do cartão
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

  @tsprime @Massa002
  Cenario: Realizar consulta de um cliente pelos números das contas
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de varios clientes pelo número da conta
    Então A consulta pelo número da conta, foi realizada com sucesso e os dados do cliente foram apresentados

  #Cenários de Teste

  @tsprime @CT001
  Esquema do Cenario: Realizar a visualização da fatura de um cliente
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Realizar a visualização da fatura atual de um cartão <cartao>
    Então A fatura do cliente será apresentada com as transações

    Exemplos:
      |cartao|
      |"5300332773544211"|

  @tsprime @CT002
  Esquema do Cenario: Realizar consulta por conta
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número da conta <conta>
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

    Exemplos:
      |conta|
      |"37078186725"|

  @tsprime @CT003
  Esquema do Cenario: Realizar consulta por cartão
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A consulta por cartão foi realizada com sucesso e os dados do cliente foram apresentados

    Exemplos:
      |cartao|
      |"5300332773544211"|

  @tsprime @CT004
  Esquema do Cenario:Verificar parâmetros para parcelamento de fatura (tela visualização)
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    E Realizar os parâmetros para parcelamento de fatura
    Então O os perfis serão editados

    Exemplos:
      |cartao|
      |"4349492776947955"|

  @tsprime @CT005
  Esquema do Cenario: Verificar acesso a funcionalidade (cartão)
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A funcionalidade cartão está ativa <cartao>

    Exemplos:
      |cartao|
      |"4349492776947955"|

  @tsprime @CT006
  Esquema do Cenario: Verificar acesso a funcionalidade (produto)
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A funcionalidade produto está ativa

    Exemplos:
      |cartao|
      |"4349492776947955"|


  @tsprime @CT007
  Esquema do Cenario: Verificar acesso a funcionalidade (conta)
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A funcionalidade conta está ativa

    Exemplos:
      |cartao|
      |"4349492776947955"|


  @tsprime @CT008
  Esquema do Cenario: Consultar cadastro de endereços
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Iniciar a procura de um cliente pelo número do cartão <cartao>
    Então A grid Endereço é apresentada com os dados do Cliente

    Exemplos:
      |cartao|
      |"4349492776947955"|

  @tsprime @CT009
  Esquema do Cenario: Validar novo terminal criado para nova loja
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2023"
    Quando Informado o número do estabelecimento no campo “Valor” <valor>
    Então Será exibido as informações do terminal na tabela de resultado da pesquisa

    Exemplos:
      |valor|
      |"2003000581"|