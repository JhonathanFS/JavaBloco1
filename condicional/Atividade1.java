package condicional;

import java.util.Scanner;

class Atividade1 {
	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira o primeiro n�mero: ");
				A = leia.nextInt();
			System.out.print("Insira o segundo n�mero: ");
				B = leia.nextInt();
			System.out.print("Insira o terceiro n�mero: ");
				C = leia.nextInt();
				
				if (A >= B && A >= C) {
					System.out.println("O maior n�mero � o primero que � " + A + ".");
				}	
				if (B >= A && B >= C) {
					System.out.println("O maior n�mero � o segundo que � " + B + ".");
				}
				if (C >= B && C >= A) {
					System.out.println("O maior n�mero � o terceiro que � " + C + ".");
				}
				if (A == B || A == C) {
					System.out.println("Todos os n�meros s�o iguais.");
				}
	}
}
