# language: pt

Funcionalidade: Parametros

  @tsprime @ct003
    Esquema do Cenario: Realizar a visualização da fatura de um cliente
    Dado Que o Tsprime seja inicializado com o usuário "cl7496_43947451873" e a senha "Cog@2022"
    Quando Realizar a visualização da fatura atual de um cartão <cartao>
    Então A fatura do cliente será apresentada com as transações

    Exemplos:
    |cartao|
    |"5300332773544211"|


