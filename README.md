<!--
*** Obrigado por estar vendo o nosso README. Se você tiver alguma sugestão
*** que possa melhorá-lo ainda mais dê um fork no repositório e crie uma Pull
*** Request ou abra uma Issue com a tag "sugestão".
*** Obrigado novamente! Agora vamos rodar esse projeto incrível :D
-->


<!-- PROJECT LOGO -->
<br />
<p align="center">
  
  <h3 align="center">Desafio Técnico JAVA </h3>
</p>

<!-- TABLE OF CONTENTS -->

## Critérios de Aceitação
<p>
O objetivo deste desafio é avaliar seu conhecimento sobre desenvolvimento de aplicações Web comênfase no aspecto Back-end, observando a qualidade de código, organização de componentes, padronização, desempenho na utilização de recursos e estruturas de dados, documentação e versionamento.
Seguem abaixo as instruções para realizar o desafio:

Você deverá criar um projeto REST simples que será responsável pela Gestão das Pessoas e seu Endereço (CRUD). Para realização do cadastro/edição de uma pessoa, será necessário informar além dos dados da pessoa, os dados do endereço da pessoa.

Seguem abaixo os campos mínimos obrigatórios que as entidades Pessoa e Endereço deverão possuir:
Pessoa: Nome, E-mail, CPF e Endereço;•
Endereço: Logradouro, Número, Bairro, CEP e Complemento.

A aplicação deverá ser desenvolvida utilizando uma das seguintes linguagens, tecnologias ou frameworks:•
REST• SpringBoot, Hibernate e JPA• Banco de dados com PostgreSQL ou MySQL;
</p>

###  Feito Com

Abaixo segue o que foi utilizado na criação deste desafio:

- [Java](https://devqa.io/brew-install-java/) - Foi utilizado o Java 11 para esse desafio;
- [SpringBoot](https://start.spring.io/) - Gerado o projeto base para geração do REST;
- [JPA](https://hibernate.org/orm/documentation/5.6/) - JPA na versão atual para anotações e ORM;
- [MySql](https://dev.mysql.com/downloads/file/?id=508095) - Banco mysql para persistência dos dados;

<!-- GETTING STARTED -->

## Começando

Para conseguir testar a api, siga os passos abaixo.


### Estrutura de Arquivos

A estrutura de arquivos está da seguinte maneira:

```bash
api
├── src/
│   ├── config/
│   │   └── ReactotronConfig.js
│   ├── images/
│   │   ├── rocketseat_logo_roxa.png
│   │   └── rocketseat_logo.png
│   ├── pages/
│   │   └── Main/
│   │       └── index.js
│   ├── services/
│   │   └── api.js
│   ├── store/
│   │   ├── ducks/
│   │   │   └── index.js
│   │   ├── sagas/
│   │   │   └── index.js
│   │   └── index.js
│   ├── index.js
│   └── routes.js
├── .editorconfig
├── .eslintrc.json
├── .gitignore
├── babel.config.js
├── dependencies.json
├── devDependencies.json
├── index.js
├── jsconfig.js
├── LICENSE
├── package.json
└── README.md
```


### Instalação

1. Para instalar e utilizar esse template o processo é bem simples, basta criar um projeto novo utilizando o comando:

```sh
react-native init AwesomeExample --template rocketseat-advanced
```

2. Depois do projeto criado você pode deletar o arquivo `App.js` da raiz, pois o arquivo `index.js` agora aponta para a pasta **src**.

Com isso o projeto será criado com todas as dependências do template devidamente instaladas e linkadas, tal como os arquivos de configuração que são copiados para o projeto.

---


## Contribuição

Contribuições são o que fazem a comunidade open source um lugar incrível para aprender, inspirar e criar. Qualquer contribuição que você fizer será **muito apreciada**.

1. Faça um Fork do projeto
2. Crie uma Branch para sua Feature (`git checkout -b feature/FeatureIncrivel`)
3. Adicione suas mudanças (`git add .`)
4. Comite suas mudanças (`git commit -m 'Adicionando uma Feature incrível!`)
5. Faça o Push da Branch (`git push origin feature/FeatureIncrivel`)
6. Abra um Pull Request


<!-- LICENSE -->

## Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

<!-- CONTACT -->

## Contato

GitHub - [Github](https://github.com/samucaguimaraes) - **samuca.guimaraes@gmail.com**
