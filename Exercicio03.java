import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] Matriz = new int[3][3];
		int maioresValores = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira os valores da Matriz");
		for (int l = 0; l < Matriz.length; l++) {
			for (int c = 0; c < Matriz[l].length; c++) {
				Matriz[l][c] = entrada.nextInt();

				if (Matriz[l][c] > 10) {
					maioresValores++;
				}
			}
		}
		
		System.out.println("Dos números inseridos, " + maioresValores + " foram maiores do que 10!!");

		entrada.close();

	}

}
