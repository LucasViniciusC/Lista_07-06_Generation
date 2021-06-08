import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] MatrizA = new double[2][2];
		double[][] MatrizB = new double[2][2];

		double soma = 0;
		double subtracao = 0;
		int operacao = 0, constante = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira os valores da primeira Matriz: ");
		for (int l = 0; l < MatrizA.length; l++) {

			for (int c = 0; c < MatrizA.length; c++) {
				MatrizA[l][c] = entrada.nextDouble();
			}
		}
		System.out.println("Insira os valores da segunda Matriz: ");
		for (int l = 0; l < MatrizA.length; l++) {

			for (int c = 0; c < MatrizB.length; c++) {
				MatrizB[l][c] = entrada.nextDouble();
			}
		}

		System.out.println(
				"(1)Somas as duas Matrizes - (2)Subtrair os valores das duas Matrizes - (3)Adicionar umas constante nas duas Matrizes - (4)Imprimir");
		operacao = entrada.nextInt();

		if (operacao == 1) {
			System.out.println("O resultado da soma das Matrizes é: \n");
			for (int l = 0; l < MatrizA.length; l++) {
				for (int c = 0; c < MatrizA.length; c++) {
					soma = MatrizA[l][c] + MatrizB[l][c];
					System.out.print(" | " + soma);
				}
			}

		}

		if (operacao == 2) {
			System.out.println("O resultado da subtração das Matrizes é: \n");
			for (int l = 0; l < MatrizA.length; l++) {
				for (int c = 0; c < MatrizA.length; c++) {
					subtracao = MatrizA[l][c] - MatrizB[l][c];
					System.out.print(" |  " + subtracao);
				}
			}
		}

		if (operacao == 3) {
			System.out.println("Informe o valor a ser alterado");
			constante = entrada.nextInt();
			for (int l = 0; l < 1; l++) {
				for (int c = 0; c < 1; c++) {
					MatrizA[l][c] = constante;
					System.out.println(MatrizA[l][c]);
				}
			}

			for (int l = 0; l < 1; l++) {
				for (int c = 0; c < 1; c++) {
					MatrizB[l][c] = constante;
					System.out.print(MatrizB[l][c]);
				}
			}

		}

		if (operacao == 4) {
			System.out.println("Os valores da primeira Matriz é : ");
			for (int l = 0; l < MatrizA.length; l++) {
				for (int c = 0; c < MatrizA.length; c++) {
					System.out.print(" | " + MatrizA[l][c]);
				}
			}
			System.out.println("\nOs valores da segunda Matriz é : ");
			for (int l = 0; l < MatrizA.length; l++) {
				for (int c = 0; c < MatrizB.length; c++) {
					System.out.print(" | " + MatrizB[l][c]);
				}
			}
		}

		entrada.close();
	}

}
