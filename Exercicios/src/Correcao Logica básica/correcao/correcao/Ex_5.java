package correcao;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//importações
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			decimais.
			Exemplos:
			Entrada: 	Saída:
			25			NUMBER = 25
			100			SALARY = U$ 550.00
			5.50
			
			Entrada: 	Saída:
			1			NUMBER = 1
			200			SALARY = U$ 4100.00
			20.50
			
			
			Entrada: 	Saída:
			6			NUMBER = 6
			145			SALARY = U$ 2254.75
			15.55
			
			
		 */
		
		// leitura de variaveis
		
		int id_f = sc.nextInt();
		double horasExtras = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		//execução
		
		double salario = valorHora * horasExtras;
		
		//apresentação
		
		System.out.println("NUMBER = " + id_f);
		System.out.printf("SALARY = %.2f%n" , salario);
		sc.close();
	}

}
