package condicional;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Insira sua Idade :");
				idade = leia.nextInt();
			
				if (idade < 10) {
					System.out.println("Muito novo pra qualquer categoria.");
				}
				if (idade >= 10 && idade <= 14) {
					System.out.println("Sua categoria é Infantil");
				}
				if (idade >= 15 && idade <= 17) {
					System.out.println("Sua categoria é Juvenil");
				}
				if (idade >= 18 && idade <= 25) {
					System.out.println("Sua categoria é Adulto");
				}
				if (idade > 25) {
					System.out.println("Muito velho pra qualquer categoria.");
				}
	}
}
	