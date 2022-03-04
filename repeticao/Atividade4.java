package repeticao;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		int x, y, loop = 0, pers[] =new int[3], gen[] =new int[3], con[] =new int[6];
		
		Scanner leia = new Scanner(System.in);
		
			while (loop!=150) {
				loop++;
				System.out.print("Qual é sua idade: ");
					int idade = leia.nextInt();
					
				System.out.print("Insira o número correspondente ao seu Gênero "
						+ "\n(1.Masculino/2.Feminino/3.Outros): ");
					 x = leia.nextInt();
						switch (x) {
							case 1:
								gen[0]++;
								break;
							case 2:
								gen[1]++;
								break;
							case 3:
								gen[2]++;
								break;
							default:
								System.out.println("Número inválido.");
								return;
						}
						
				System.out.print("Insira o número correspondente a sua Personalidade"
							+ "\n(1.Calma/2.Nervosa/3.Agressiva): ");
					 y = leia.nextInt();
						switch (y) {
							case 1:
								pers[0]++;
								break;
							case 2:
								pers[1]++;
								break;
							case 3:
								pers[2]++;
								break;
							default:
								System.out.println("Número inválido.");
								return;
						}
						
				if (y==1) {
					con[0]++;
				}
				if (x==2 && y==2) {
					con[1]++;
				}
				if (x==1 && y==3) {
					con[2]++;
				}
				if (x==3 && y==1) {
					con[3]++;
				}
				if (idade>40 && y==2) {
					con[4]++;
				}
				if (y==1 && idade<18) {
					con[5]++;
				}
			}
			
			System.out.println("Número de pessoas calmas é "+con[0]);
			System.out.println("Número de número de mulheres nervosas é "+con[1]);
			System.out.println("Número de homens agressivos é "+con[2]);
			System.out.println("Número de outros calmos é "+con[3]);
			System.out.println("Número de pessoas nervosas com mais de 40 anos é "+con[4]);
			System.out.println("Número de pessoas calmas com menos de 18 anos é "+con[5]);
	}	
}
