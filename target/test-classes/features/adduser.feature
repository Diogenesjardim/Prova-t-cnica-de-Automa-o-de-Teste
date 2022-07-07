#language: pt
@teste
Funcionalidade: Adicionar usuario
  Como usuario eu quero criar uma conta

  @adicionar
    Cenario: Adicionar um usuario
     Dado que selecione o bootstrap v4
     Quando preeencho os dados
     E  clicar em salvar
     Entao Validar a mensagem "Your data has been successfully stored into the database. Edit Customer or Go back to list"
   
     
    
   
 

