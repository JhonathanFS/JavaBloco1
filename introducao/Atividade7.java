package introducao;

import java.util.Scanner;

public class Atividade7 {
	
	public static void main(String[] args) {
		
		float  A, B, C, D, E, F, X, Y;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Entre com os valores de A: ");
				A = leia.nextFloat();
			System.out.print("Entre com os valores de B: ");
				B = leia.nextFloat();
			System.out.print("Entre com os valores de C: ");
				C = leia.nextFloat();
			System.out.print("Entre com os valores de D: ");
				D = leia.nextFloat();
			System.out.print("Entre com os valores de E: ");
				E = leia.nextFloat();
			System.out.print("Entre com os valores de F: ");
				F = leia.nextFloat();
			
					X = (C * E - B * F) / (A * E - B * D);
					Y = (A * F - C * D) / (A * E - B * D);
					
			System.out.print("Os valores de X e Y são respectivamente: " + X + " e " + Y);
	}
}
