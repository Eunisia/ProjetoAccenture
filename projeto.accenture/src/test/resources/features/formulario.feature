#language:pt
#Author: eunisia.freitas@gmail.com.br

@executa
Funcionalidade: Validar formulario
  Eu como usuario quero preencher o formulario e seguir para o próximo passo 

  @executa1
  Cenario: Preencher formulario
    Dado que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
    Quando eu preencher o formulario 
    Entao seguirei para a proxima etapa
    


