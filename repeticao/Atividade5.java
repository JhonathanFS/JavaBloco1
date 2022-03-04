package repeticao;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		
		int n, total = 0;
		
		System.out.println("Para finalizar insira 0");
		
		Scanner leia = new Scanner(System.in);
			
			do {
				System.out.print("Insira um número: ");
					n = leia.nextInt();
					total = total + n;
			} while (n!=0);
			
			System.out.println("A soma é "+total+".");
			System.out.println("Fim do Programa.");
	}
}
