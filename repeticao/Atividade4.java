package repeticao;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		int x, y, loop = 0, pers[] =new int[3], gen[] =new int[3], con[] =new int[6];
		
		Scanner leia = new Scanner(System.in);
		
			while (loop!=150) {
				loop++;
				System.out.print("Qual � sua idade: ");
					int idade = leia.nextInt();
					
				System.out.print("Insira o n�mero correspondente ao seu G�nero "
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
								System.out.println("N�mero inv�lido.");
								return;
						}
						
				System.out.print("Insira o n�mero correspondente a sua Personalidade"
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
								System.out.println("N�mero inv�lido.");
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
			
			System.out.println("N�mero de pessoas calmas � "+con[0]);
			System.out.println("N�mero de n�mero de mulheres nervosas � "+con[1]);
			System.out.println("N�mero de homens agressivos � "+con[2]);
			System.out.println("N�mero de outros calmos � "+con[3]);
			System.out.println("N�mero de pessoas nervosas com mais de 40 anos � "+con[4]);
			System.out.println("N�mero de pessoas calmas com menos de 18 anos � "+con[5]);
	}	
}
