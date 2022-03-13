# DSMovie
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RicardoLopes1/dsmovie/blob/main/LICENSE)
# Sobre o projeto

<p><a href="https://rlopes-dsmovie.netlify.app/" target="_blank">
https://rlopes-dsmovie.netlify.app/</a>
</p>

DSMovies é uma aplicação *Web* construída durante a 7ª edição da **Semana Spring React** (#sds7), evento organizado pela [DevSuperior](https://learn.devsuperior.com "Site da DevSuperior"). 

Esta aplicação consiste em uma tela inicial com a listagem dos filmes que estão no banco de dados, e uma segunda tela onde é possível avaliar o filme escolhido utilizando um e-mail válido. É cadastrado apenas uma avaliação por e-mail, sendo possível redefinir sua avaliação reavaliando o filme utilizando o mesmo e-mail já usado.

## Layout web
![listar](readme-img/listar-filmes.png)

![avaliar](readme-img/avaliar-filme.png)

# Padronização do modelo back-end

## Modelo conceitual
![modelo-conceitual](readme-img/modelo-conceitual.png)

## Padrão camadas adotado
![padrao-camadas-adotado](readme-img/padrao-camadas-adotado.png)

## Lógica para salvar avaliação
![modelo-conceitual](readme-img/logica-salvar-avaliacao-dsmovie-objs.png)

# Tecnologias utilizadas
## Back-end
<p align="left"> 
<a href="https://maven.apache.org" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/maven.png" alt="maven" width="120" height="40"/> </a> 
<a href="https://www.java.com" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://pt.wikipedia.org/wiki/Java_Persistence_API" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/JPA-hibernate.jpg" alt="JPA-hibernate" width="120" height="40"/> </a>
<a href="https://spring.io/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/springio-icon.svg" alt="spring" width="40" height="40"/> </a>
</p>

## Front-end
<p align="left"> 
<a href="https://github.com/axios" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/axios-icon.png" alt="arduino" width="40" height="40"/> </a> 
<a href="https://getbootstrap.com" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/bootstrap-plain-wordmark.svg" alt="bootstrap" width="40" height="40"/> </a>
<a href="https://www.w3schools.com/css/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/css3-original-wordmark.svg" alt="css3" width="40" height="40"/> </a> 
<a href="https://www.w3.org/html/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/html5-original-wordmark.svg" alt="html5" width="40" height="40"/> </a> 
<a href="https://reactjs.org/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/react-original-wordmark.svg" alt="react" width="40" height="40"/> </a>
<a href="https://www.typescriptlang.org/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/typescript-icon.svg" alt="typescript" width="40" height="40"/> </a>
</p>

# Implantação em produção
## Back-end
<a href="https://heroku.com" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/heroku-icon.svg" alt="heroku" width="40" height="40"/> </a> 

## Front-end 
<a href="https://www.netlify.com" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/netlify.png" alt="netlify" width="120" height="40"/> </a> 

## Banco de dados 
<a href="https://www.postgresql.org" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/postgresql-original-wordmark.svg" alt="postgresql" width="80" height="40"/> </a>
<a href="#"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/h2-database-logo.png" alt="html5" width="80" height="40"/> </a> 

# Como executar o projeto

## Back-end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:RicardoLopes1/dsmovie.git

# entrar na pasta do projeto back-end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front-end
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone git@github.com:RicardoLopes1/dsmovie.git

# entrar na pasta do projeto front end
cd frontend

# instalar dependências
yarn

# executar o projeto
yarn start
```

## Autor
Paulo Ricardo da Silva Lopes
<p align="left">
<a href="https://linkedin.com/in/paulo-ricardo-da-silva-lopes-092406197" target="_blank"><img align="center" src="https://github.com/RicardoLopes1/assets/blob/main/icon/linkedin-icon.svg" alt="paulo-ricardo-da-silva-lopes-092406197" height="30" width="40" /></a>
<a href="https://fb.com/ricardosilva31" target="_blank"><img align="center" src="https://github.com/RicardoLopes1/assets/blob/main/icon/facebook-icon.svg" alt="ricardosilva31" height="30" width="40" /></a>
<a href="https://www.instagram.com/oricardo.lopes/" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/ig-icon.png" alt="instagram" width="40" height="40"/> </a> 
</p>

## Agradecimentos
[DevSuperior - escola de programação](https://learn.devsuperior.com "Site da DevSuperior").
<p align="left">
<a href="https://instagram.com/devsuperior.ig" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/ig-icon.png" alt="DevSuperior no Instagram" width="40" height="40"/> </a> 
<a href="https://youtube.com/devsuperior" target="_blank"> <img src="https://github.com/RicardoLopes1/assets/blob/main/icon/yt-icon.png" alt="DevSuperior no Youtube" width="40" height="40"/> </a>
</p>
