package java_pratica4;

import java.util.Scanner;

public class Vetor_exercicio1 {

	public static void main(String[] args) {

		int vetorInt[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número entre 1 e 10");
		int numero = leia.nextInt();

		for (int indice = 0; indice < 10; indice++) {
			if (vetorInt[indice] == numero)
				System.out.println("Posição do número " + numero + ": " + indice);
		}

		leia.close();

	}
}
