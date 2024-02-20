package correcao;

public class EX_01 {
/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10			SOMA = 40
30
Entrada: Saída:
-30			SOMA = -20
10
Entrada: Saída:
0			SOMA = 0
0
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variaveis
		int n1 = 10;
		int n2 = 30;
		int n3 = -30;
		int n4 = 10;
		int n5 = 0;
		int n6 = 0;
		int[] soma = new int[4];

		// Execução
		soma[1] = n1 + n2;
		soma[2] = n3 + n4;
		soma[3] = n5 + n6;

		// apresentação

		for (int i = 1; i <= 3; i++) {
		  System.out.println("soma = " + soma[i]);
		}

	}

}
