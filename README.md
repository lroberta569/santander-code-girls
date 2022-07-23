# Bootcamp Santander Code Girls
Projetos propostos pelo Bootcamp Santander Code Girls - DIO

## 💻 Tecnologias utilizadas
- Java

## 📈 Status do projeto
Em andamento

# Desafio 1 - <a href="https://github.com/lroberta569/santander-code-girls/blob/main/Desafios%20Java/Desafios/src/com/br/basico/Intervalo.java">Intervalo</a>

Faça um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Caso o valor não esteja em nenhum destes intervalos, deverá ser impressa a mensagem: “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

<p><strong>Entrada</strong> <br>
O arquivo de entrada contém um número com ponto flutuante qualquer.<br>
<strong>Saída</strong> <br>
A saída deve ser uma mensagem conforme exemplo abaixo.
</p>

<p><strong>Exemplo de Entrada:</strong> <br>
25.01<br>
<strong>Exemplo de Saída:</strong> <br>
Intervalo (25,50]<br>
 
<p><strong>Entrada</strong> <br>
25.00 <br>
<strong>Saída</strong> <br>
Intervalo [0,25] <br>
<p><strong>Entrada</strong> <br>
100.00 <br>
<strong>Saída</strong> <br>
Intervalo (75,100] <br>
<p><strong>Entrada</strong> <br>
-25.02 <br>
<strong>Saída</strong> <br>
Fora de intervalo <br>
 
# Desafio 2 - <a href="https://github.com/lroberta569/santander-code-girls/blob/main/Desafios%20Java/Desafios/src/com/br/basico/Domino.java">Dominó</a>
O tradicional jogo de dominó possui 28 peças, sendo que ada peça está dividida em dois quadrados e dentro de cada quadrado há entre 0 e 6 círculos. O jogo é chamado também de duplo-6 porque esse é o maior número de círculos que aparece num quadrado de uma peça.

A figura junto desse desafio mostra uma forma de organizar as 28 peças do jogo em 7 linhas. Essa figura permite ver claramente quantas peças haveria num jogo de dominó, por exemplo, do tipo duplo-4: seriam todas as peças das 5 primeiras linhas, 15 peças no total. Também poderíamos ver, seguindo o padrão da figura, quantas peças possui o jogo de dominó conhecido como mexicano, que é o duplo-12. Seriam 91 peças, correspondendo a 13 linhas.

Não de forma surpreendente, existe uma fórmula com a qual podemos calcular facilmente o número de peças de um jogo do tipo duplo-N, para um número N natural qualquer: ((N+1)*(N+2))/2. Bom, não é porque a fórmula existe que não temos um problema para você: estamos precisando da sua ajuda para escrever um programa que, dado o valor N, use esta fórmula para calcular e imprimir quantas peças existem num jogo de dominó do tipo duplo-N.

<strong>Restrições</strong><br>
0 ≤ N ≤ 10000<br>

<p><strong>Exemplos de Entrada</strong> <br>
6<br>
</p>
<p><strong>Exemplos de Saída</strong> <br>
28
</p>

# Desagio 3 -  <a href="https://github.com/lroberta569/santander-code-girls/blob/main/Desafios%20Java/Desafios/src/com/br/basico/SelecaoIndiceVetor.java">Seleção de Índice do Vetor</a>
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que, ao indicar o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.

# Entrada
As primeiras 5 linhas da entrada deverá contaro o vetor NOMES com 5 espaços na memoria, a última linha deverá conter a posição escolhida do vetor.

# Saída
A saída deverá retornar o nome de acordo com a posição do vetor escolhida anteriormente, conforme exemplo abaixo.


<p><strong>Exemplos de Entrada</strong> <br>
João<br>
Maria<br>
Carlos<br>
Karla<br>
Joana<br>
4 <br>
</p>
<p><strong>Exemplos de Saída</strong> <br>
Joana
</p>
