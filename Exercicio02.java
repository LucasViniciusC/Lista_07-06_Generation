import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int soma = 0, totalNumImpar = 0;

		int[] numeros = new int[6];
		int[] numPares = new int[6];
		int[] numImpar = new int[6];

		System.out.println("Informe os 6 n�meros do vetor: ");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();

			numPares[i] += numeros[i];
			numImpar[i] += numeros[i];
		}

		System.out.println("N�meros pares inseridos foram: ");
		for (int i = 0; i < numPares.length; i++) {
			if (numPares[i] % 2 == 0) {
				System.out.print("| " + numPares[i]);
				soma += numPares[i];
			}
		}
		System.out.println("\n\nA soma dos valores pares �: \n" + soma);
		System.out.println("\nN�mero �mpares inseridos foram: ");
		for (int i = 0; i < numImpar.length; i++) {
			if (numImpar[i] % 2 != 0) {
				System.out.print(" | " + numImpar[i]);
				totalNumImpar++;
			}
		}
		
		System.out.println("\n\nO total de n�meros �mpares foi de: " + totalNumImpar);
		
		entrada.close();
	}
}
