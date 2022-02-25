package introducao;

import java.util.Scanner;

public class Atividade5 {
	
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, pon1, pon2, pon3, notaOmega, re;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Ensira a primeira nota do Aluno: ");
				nota1 = leia.nextFloat();
			System.out.print("Ensira a segunda nota do Aluno: ");
				nota2 = leia.nextFloat();
			System.out.print("Ensira a ter nota do Aluno: ");
				nota3 = leia.nextFloat();
					
					pon1 = nota1 * 2;
					pon2 = nota2 * 3;
					pon3 = nota3 * 5;
					notaOmega = pon1 + pon2 + pon3;
					re = notaOmega / 10;
					
			System.out.print("Sua nota ponderada é " + re);
	}
}
