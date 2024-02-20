package correcao;

import java.util.Locale;

public class EX_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
			Exemplos:
			Entrada:	Saída:
			2.00 		A=12.5664
			Entrada: 	Saída:
			100.64 		A=31819.3103
			Entrada: 	Saída:
			150.00 		A=70685.7750
		 */
		//variaveis
		double PI = 3.14159;
		double n1 = 2.00;
		double n2 = 100.64;
		double n3 = 150.00;
		
		double[] a = new double[4];
		//execução
		a[1] = PI * Math.pow(n1, 2);
		a[2] = PI * Math.pow(n2, 2);
		a[3] = PI * Math.pow(n3, 2);
		
		//apresentação
		for (int i = 1; i <= 3; i++) {
			  System.out.printf("A = %.4f%n" , a[i]);
			}
		}

	}

