
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int[] vetorA = new int[6];

		vetorA[0] = 1;
		vetorA[1] = 0;
		vetorA[2] = 5;
		vetorA[3] = -2;
		vetorA[4] = -5;
		vetorA[5] = 7;

		soma = vetorA[0] + vetorA[1] + vetorA[5];
		vetorA[3] = 100;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}

		System.out.println("A soma dos valores das posições - 0º , 1º , 5º é: " + soma);
	}

}
