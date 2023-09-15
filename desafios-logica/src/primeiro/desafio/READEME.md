## Descrição
Para esse desafio, considere que você foi contratado por uma empresa bancária para auxiliar nas implementações e melhorias do sistema empresarial. Em uma análise inicial, foi identificado pela equipe financeira a necessidade de desenvolver uma solução que permita ao cliente equilibrar seu saldo bancário. Dessa forma, o programa deve solicitar uma entrada que representa o saldo atual do funcionário, e após, seja informado o valor de duas transações, sendo elas: um depósito e um saque. O programa deve atualizar o saldo com base nas transações e exibir o saldo final.

Informação: As transações de depósito e retirada devem ser tratadas como valores positivos e negativos, respectivamente, para garantir que o cálculo do saldo final seja realizado corretamente.
 

## Entrada
saldoAtual: um número decimal representando o saldo atual da conta bancária.
valorDeposito: um número decimal representando o valor a ser depositado na conta.
valorRetirada: um número decimal representando o valor a ser retirado da conta.

Regra de Formatação: Considere apenas uma casa decimal para esse desafio.

## Saída
 Um número decimal que representa o saldo atualizado na conta bancária após o processamento das transações.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

## Entrada  |	Saída


| Entrada | Saída |
|---------|-------|
| 1000    |       |
| 500     |       |
| 200     | Saldo atualizado na conta: 1300.0 |
| 100     |       |
| 10      |       |
| 50      | Saldo atualizado na conta: 60.0 |
| 4000    |       |
| 1500    |       |
| 200     | Saldo atualizado na conta: 5300.0 |


Todas as entradas e saída dos algoritmos são utilizados o STDIN e STDOUT de cada linguagem, abaixo tem algumas dicas de como utilizar cada STDIN e STDOUT de cada linguagem.

### JavaScript

Em JavaScript as funções de STDIN e STDOUT respectivamente são gets e console.log, a função gets é implementada internamente para auxiliar a entrada dos dados.

Exemplo:
let line = gets(); // Lê a linha de entrada
console.log(line); // Imprime o dado

### Java

Em Java existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar BufferedReader para o STDIN e o System.out.println para o STDOUT.

Exemplo:
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
int a = Integer.parseInt(st.nextToken());
System.out.println(a); // Imprime o dado

### Python

Em Python existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar sys.stdin.readline para o STDIN e o print para o STDOUT.

Exemplo:
import sys
a = int(sys.stdin.readline()) // Lê a linha de entrada
print(a); // Imprime o dad0