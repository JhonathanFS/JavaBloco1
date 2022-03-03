package condicional;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		float n, pon, quad;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira um número : ");
				n = leia.nextFloat();
			
				if (n == 0) {
					System.out.println("O número é neutro.");
				} else if (n % 2 == 0) {
					quad = (float) Math.sqrt(n);
					System.out.println("O número é par e sua " +
					"raiz quadrada é " + quad + ".");
				} else {
					pon = (float) Math.pow(n, 2);
					System.out.println("O número é impar e sua " +
					"pontência elevada ao quadrado é " + pon + ".");
				}
	}
}