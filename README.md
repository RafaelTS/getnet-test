# Objetivo
Apresentar o teste solicitado demonstrando boas práticas de código com a linguagem java e selenium.

O Projeto getnet-test trata-se de um projeto de testes efetuado com java e selenium webdriver, utlizando boas práticas de código como page objects e configuração de dependência em Maven persistido em unidade de disco do Windows para disponibilizacao de um serviço HTTP. 

## Testes efetuados:
Passos:

- Acessar o site: https://site.getnet.com.br/
- No campo de busca(LUPA), pesquisar por "superget"
- No resultado da busca, clicar no link " Como posso abrir uma conta SuperGet?"
- Verificar se a modal foi aberta com a mensagem “Como posso abrir uma conta SuperGet?"

## Observação:
O teste original solicitava o link: "como faço a portabilidade da minha maquininha" porém o mesmo não se encontra disponível.

# 1 - Executando os testes via Maven:

Observação: os passos abaixo são para o sistema operacional Windows.

## 1.1 Pré-requisistos
Para construir e rodar a aplicação você precisa de:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.6.3](https://maven.apache.org)

## 1.2 Passo a passo
1.2.1 - [Baixar o projeto](https://github.com/rafaelTS/getnet-test/archive/master.zip)

1.2.2 - Descompacte o zip, entre no diretório descompactado via prompt do windows.

1.2.3 - Os arquivos chromedriver.exe e geckodriver.exe devem ser colocados na raiz do projeto.

1.2.4 - Executando maven:
- Pelo cmd (DOS), navegue até a pasta raiz;
- Execute o comando "mvn test" e pressione enter.

mvn test


# 2 - Drivers
Estão disponíveis os drivers chromedriver e geckodriver. Necessário colocar ambos na raiz do projeto.

Por configuração, neste momento está rodando com o firefox. Caso deseja alterar, necessário alterar a propriedade na classe br.sc.rafael.core.propriedade.java para:

public static Browsers browser = Browsers.CHROME;
