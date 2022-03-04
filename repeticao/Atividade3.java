package repeticao;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		int x = 0, id1 = 0, id2 = 0;
		
		Scanner leia = new Scanner(System.in);
			
			System.out.println("Para finalizar insira -99");
			System.out.print("\nInforme a idade: ");
			 	x = leia.nextInt();
				if(x<21) {
					id1++;
				}
				if(x>50) {
					id2++;
				}
				
			while(x!=-99) {
				if(x<21) {
					id1++;
				}
				if(x>50) {
					id2++;
				}
				System.out.print("Informe a idade: ");
			 		x = leia.nextInt();
			}
			
			System.out.println("Menor de 21 são "+id1+
							   "\nMaiores de 50 são "+id2);
			System.out.println("Fim do Programa");
	}
}
