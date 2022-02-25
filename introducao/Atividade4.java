package introducao;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		float A, B, C, S, R, F, E, G, D;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Escreva o valor de A: ");
				A = leia.nextFloat();
			System.out.print("Escreva o valor de B: ");
				B = leia.nextFloat();
			System.out.print("Escreva o valor de C: ");
				C = leia.nextFloat();
				
					F = A + B;
					E = B + C;
					R = F * F;
					S = E * E;
					G = R + S;
					D = G / 2;
					
			System.out.print("O D é " + D + ".");
	}
}
