package java_pratica4;

import java.util.Scanner;

public class Vetor_exercicio2 {

	public static void main(String[] args) {

		int vetorInt[] = new int[10];
		int numero;
		int soma = 0;
		int pares;
		float media = 0;

		Scanner leia = new Scanner(System.in);

		for (numero = 0; numero < vetorInt.length; numero++) {
			System.out.println("Digite um número:");
				vetorInt[numero] = leia.nextInt();

			soma += vetorInt[numero];

		}

		leia.close();

		pares (numero % 2 == 0);
		media = ((soma*numero)/vetorInt.length);
		
		for (numero = 0; numero < vetorInt.length; numero++) {
			if (vetorInt[numero] % 2 == 0);
				System.out.println("Número pares: " + pares);
		}

	}
}
