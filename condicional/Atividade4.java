package condicional;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		float n, pon, quad;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira um n�mero : ");
				n = leia.nextFloat();
			
				if (n == 0) {
					System.out.println("O n�mero � neutro.");
				} else if (n % 2 == 0) {
					quad = (float) Math.sqrt(n);
					System.out.println("O n�mero � par e sua " +
					"raiz quadrada � " + quad + ".");
				} else {
					pon = (float) Math.pow(n, 2);
					System.out.println("O n�mero � impar e sua " +
					"pont�ncia elevada ao quadrado � " + pon + ".");
				}
	}
}