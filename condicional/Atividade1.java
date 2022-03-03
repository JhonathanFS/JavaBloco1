package condicional;

import java.util.Scanner;

class Atividade1 {
	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira o primeiro número: ");
				A = leia.nextInt();
			System.out.print("Insira o segundo número: ");
				B = leia.nextInt();
			System.out.print("Insira o terceiro número: ");
				C = leia.nextInt();
				
				if (A >= B && A >= C) {
					System.out.println("O maior número é o primero que é " + A + ".");
				}	
				if (B >= A && B >= C) {
					System.out.println("O maior número é o segundo que é " + B + ".");
				}
				if (C >= B && C >= A) {
					System.out.println("O maior número é o terceiro que é " + C + ".");
				}
				if (A == B || A == C) {
					System.out.println("Todos os números são iguais.");
				}
	}
}
