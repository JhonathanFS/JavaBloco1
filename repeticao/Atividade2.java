package repeticao;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		
		int n = 0, p = 0, i = 0, vet[] =new int[10];
		
		Scanner leia = new Scanner(System.in);
		
			for(int x=0;x<10;x++) {
				System.out.print("Insira um n�mero: ");
					vet[x] = leia.nextInt();
			}
		
			for(int x=0;x<10;x++) {
				if (vet[x] == 0) {
					n++;
				} else if (vet[x] % 2 == 0) {
					p++;
				} else {
					i++;
				}
			}
		
		System.out.println("\nS�o "+p+" pares."+
						   "\nS�o "+i+" impares."+
						   "\nS�o "+n+" neutros (Zero).");
	}
}
