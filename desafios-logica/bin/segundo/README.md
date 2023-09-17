# Descrição

Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancária, foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários. Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos que será informada pelos usuários. Os ativos são representados por strings que representam seus tipos, como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros.

## Entrada

A primeira entrada consiste em um número inteiro que representa a quantidade de ativos que o usuário possui. Em seguida, o usuário deverá informar, em linhas separadas, os tipos (strings) dos respectivos ativos.

## Saída

Seu programa deve exibir a lista de Ativos organizada em ordem alfabética. Cada ativo deve ser apresentado em uma linha separada.

## Exemplos

| Entrada | Saída |
|---|---|
| 3 | `Deposito` | `Financiamento de Imovel` | `Reservas Bancarias` |
| 3 | `Carteiras de credito` | `Derivativos financeiros` | `Investimentos em titulos` |
| 3 | `Reservas de liquidez` | `Ativos intangiveis` | `Fundos de investimento` |



**Tabela 1:**
| Entrada | Saída |
| --- | --- |
| Financiamento de Imovel | Deposito |
| Deposito | Financiamento de Imovel |
| Reservas Bancarias | Reservas Bancarias |

**Tabela 2:**
| Entrada | Saída |
| --- | --- |
| Carteiras de credito | Carteiras de credito |
| Investimentos em titulos | Derivativos financeiros |
| Derivativos financeiros | Investimentos em titulos |

**Tabela 3:**
| Entrada | Saída |
| --- | --- |
| Reservas de liquidez | Ativos intangiveis |
| Ativos intangiveis | Fundos de investimento |
| Fundos de investimento | Reservas de liquidez |




### Formatação

* Os títulos dos tópicos foram formatados como **h1**, **h2** e **h3**.
* O texto foi formatado como parágrafos.
* As listas foram formatadas como listas numeradas.
* As tabelas foram formatadas como tabelas Markdown.

### Comentários

* O README foi dividido em seções para facilitar a leitura.
* Os exemplos foram fornecidos para ilustrar o funcionamento da solução.
* A formatação foi aplicada para melhorar a legibilidade e a apresentação do README.
