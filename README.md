<h1 align="center">
  'Xingue Aqui' Restfull API 🧑‍💻
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Java&message=Spring+Boot&color=8257E5&labelColor=000000" alt="Spring Boot" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Projeto+Academico&color=8257E5&labelColor=000000" alt="Projeto Acadêmico" />
</p>

Este projeto acadêmico tem como propósito a construção de um dataset sólido de palavras inadequadas, destinado ao aprimoramento do treinamento do nosso modelo de machine learning.

Neste repositório, encontra-se a API REST desenvolvida em Java e Spring Boot.


## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Registro de Swear Words
```
$ http POST :8080/swearword/create swear_word="Seu bananão 🍌" categorie="VIOLENCIA"

{
	"swear_word": "Seu bananão 🍌",
	"categorie": "VIOLENCIA"
}
```

- Ter acesso as categorias disponíveis
```
$ http GET :8080s
```