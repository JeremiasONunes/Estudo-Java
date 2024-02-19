package correcao;

import java.util.Locale;
import java.util.Scanner;

public class EX_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * 	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
			código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
			Exemplos:
			Entrada:   	Saída:
			12 1 5.30 	VALOR A PAGAR: R$ 15.50
			16 2 5.10
			
			Entrada: 	Saída:
			13 2 15.30 	VALOR A PAGAR: R$ 51.40
			161 4 5.20
			
			Entrada: 	Saída:
			1 1 15.10	VALOR A PAGAR: R$ 30.20
			2 1 15.10
			
		 */
			//variaveis
			int numeroDePecas;
			double valorUnitario;
			
			int codigoPeca1;	
			int codigoPeca2;
			double somatoria;
			//leitura/execução
			codigoPeca1 = sc.nextInt();		
			numeroDePecas = sc.nextInt();
			valorUnitario = sc.nextDouble();
			
			somatoria = valorUnitario * numeroDePecas;
			
			codigoPeca2 = sc.nextInt();
			numeroDePecas = sc.nextInt();
			valorUnitario = sc.nextDouble();
			
			somatoria += valorUnitario * numeroDePecas;
			//apresentação
			System.out.printf("VALOR A PAGAR: R$ %.2f", somatoria);
		
		sc.close();
	}

}
