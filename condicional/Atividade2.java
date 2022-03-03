package condicional;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira o primeiro número: ");
				A = leia.nextInt();
			System.out.print("Insira o segundo número: ");
				B = leia.nextInt();
			System.out.print("Insira o terceiro número: ");
				C = leia.nextInt();
				
				
				if (A != B && A != C && B != C ) {
					if (A >= B && A >= C) {
						if (B >= C) 	{
							System.out.println("A Ordem é " + C +
									" - "+ B +" - " + A + ".");
						} else {
							System.out.println("A Ordem é " + B +
									" - " + C + " - " + A + ".");
						}
					}	
					
					if (B >= A && B >= C) {
						if (A >= C) {
							System.out.println("A Ordem é " + C +
									" - " + A + " - " + B + ".");
						} else {
							System.out.println("A Ordem é " + A +
									" - " + C + " - " + B + ".");
						}
					}
			
					if (C >= B && C >= A) {
						if (A >= B) {
							System.out.println("A Ordem é " + B +
									" - " + A + " - " + C +".");
						} else {
							System.out.println("A Ordem é " + A +
									" - " + B + " - " + C + ".");
						}
					}
				} else {
					System.out.println("A Ordem é " + A +
									" - " + B + " - " + C + ".");
				}
	}
}
