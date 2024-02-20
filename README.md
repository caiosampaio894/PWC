DESAFIO DE CÓDIGO PWC


Endereço
Um provedor de endereços retorna endereços apenas com ruas concatenadas,
nomes e números em uma única string. Nosso próprio sistema, por outro lado, tem
campos específicos para armazenar o nome da rua e o número da rua.
Portanto, se faz necessário escrever um código simples que processe a entrada e retorne
esses campos na saída.
Entrada: string de endereço com os dados concatenados.
Saída: string da rua e string do número da rua.

1. Casos Simples:(Caso1e2.java)
a. “Miritiba 339” -> {“Miritiba”, “339”}
b. “Babaçu 500” -> { “Babaçu”, “500”}
c. “Cambuí 804B” -> {“Cambuí”, “123B”}

3. Considere os casos mais complicados:(Caso1e2.java)
a. “Rio Branco 23” -> {“Rio Branco”, “23”}
b. “Quirino dos Santos 23 b” -> {“Quirino dos Santos”, ”23 b”}

4. Considere endereços de outros países (casos complexos)(Caso3.java)
a. “4, Rue de la République” -> {"Rue de la République", "4"}
b. “100 Broadway Av” -> {"Broadway Av", "100"}
c. “Calle Sagasta, 26” -> {“Calle Sagasta”, “26”}
d. “Calle 44 No 1991” -> {“Calle 44”, “No 1991”}


O código para resolução do caso 1, a-c e 3, a-b está no arquivo Caso1e2.java
O código para resolução do caso 4, a-d está no arquivo Caso3.java
