# Objetivo
Apresentar 3 testes demonstrando boas práticas de código.

O Projeto AutomationTesting(nome do site) trata-se de um teste efetuado com javasistema sob arquitetura Java/Spring Boot, configuração de dependência em Maven e banco de dados H2 persistido em unidade de disco do Windows para disponibilização de um serviço HTTP. 

## Testes efetuados:
- Efetuar login;
- Registrar um usuário na página principal;
- Selecionar um determinado produto, adicionar na lista, validar se foi adicionado e validar se o valor e o produto estão corretos no carrinho;

## Teste Bônus:
- Ler o conteúdo de um alert e clicar em OK.

# 1 - Executando os testes via Maven:

Observação: os passos abaixo foram montandos para Windows.

## 1.1 Pre-requisistos
Para construir e rodar a aplicação você precisa de:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.6.3](https://maven.apache.org)

## 1.2 Passo a passo
1.2.1 - [Baixar o projeto](https://github.com/rafaelTS/AutomationTesting/archive/master.zip)

1.2.2 - Descompacte o zip, entre no diretório descompactado via prompt do windows.

1.2.3 - Os arquivos chromedriver.exe e geckodriver.exe devem ser colocados na raiz do projeto.

1.2.4 - Executando maven:
- Pelo prompt-dos, navegue até a pasta raiz;
- Execute o comando "mvn test" e pressione enter.

mvn test


# 2 - Drivers
Estão disponíveis os drivers chromedriver e geckodriver. Necessário colocar ambos na raiz do projeto.

Por configuração, neste momento está rodando com o chromedriver. Caso deseja alterar, necessário alterar a propriedade na classe br.sc.rafael.core.propriedade.java para:

public static Browsers browser = Browsers.FIREFOX;
