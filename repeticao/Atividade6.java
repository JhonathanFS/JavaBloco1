package repeticao;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {

		int n, total = 0, con = 0;

		Scanner leia = new Scanner(System.in);
			
			System.out.println("Para finalizar insira 0");
			
			do {
				System.out.print("Insira um número: ");
					n = leia.nextInt();
				if (n%3==0) {
					total = total + n;
					con++;
				}
			} while (n!=0);

			System.out.println("A média dos múltiplos"
					+ " de 3 é "+total/con+".");
			System.out.println("Fim do Programa.");
	}
}
