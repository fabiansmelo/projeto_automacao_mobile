#language: pt
#encoding: UTF-8
@End2End
Funcionalidade: Gestor de Orcamento - Despesas

  Eu enquanto usu�rio necessito organizar minhas financas para que eu consiga cortar gastos desnecess�rios e poupar dinheiro

  Cenario: Adicionar despesas

    Dado que o usuario esteja na pagina principal do aplicativo
    E o usuario adiciona uma despesa de '2000' da categoria 'familia'
    Entao o aplicativo adiciona uma nova despesa

  @SomaTransacoes
  Cenario: Soma dos cenarios
    Dado que o usuario esteja na pagina principal do aplicativo
    E o usuario adiciona uma despesa de '2000' da categoria 'familia'
    E o usuario adiciona uma despesa de exercicio
    Entao o sistema exibe a soma das transacoes: '2.120'

#Por falta de tempo os cenarios abaixo ainda nao foram implementados.
#Cenario: Alterar despesas
#Dado que o usuario esteja na pagina principal do aplicativo
#E o usuario adiciona uma despesa de '2000' da categoria 'familia'
#Quando o usuario altera o valor para '2001'
#Entao a despesa eealterada para '2001'

#Cenario: Remover Despesa
#Dado que o usuario esteja na pagina principal do aplicativo
#E o usuario adiciona uma despesa de '2000' da categoria 'familia'
#Quando o usu�rio remove a despesa
#Entao a despesa � removida

