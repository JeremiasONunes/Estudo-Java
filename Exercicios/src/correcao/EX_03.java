package correcao;

import java.util.Locale;
import java.util.Scanner;

public class EX_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * 	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
			de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
			Exemplos:
			Entrada: 	Saída:
			5			DIFERENCA = -26
			6
			7
			8
			
			Entrada: 	Saída:
			5			DIFERENCA = 86
			6
			-7
			8
			
		 */
		//leitura das variaveis
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		
		//execução
		
		int resultado = (a * b) - (c * d);
		
		//apresentação
		
		System.out.printf("DIFERENCA = %d" , resultado);
		sc.close();
		}
}
