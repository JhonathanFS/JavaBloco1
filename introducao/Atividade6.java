package introducao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int x1, x2, y1, y2, xx, yy;
		float x4, y4, base, d;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Ensira o eixo X do primeiro ponto: ");
				x1 = leia.nextInt();
			System.out.print("Ensira o eixo Y do primeiro ponto: ");
				y1 = leia.nextInt();
			System.out.print("Ensira o eixo X do segundo ponto: ");
				x2 = leia.nextInt();
			System.out.print("Ensira o eixo Y do segundo ponto:: ");
				y2 = leia.nextInt();
				
					xx = x1 - x2;
					yy = y1 - y2;
					x4 = xx * xx;
					y4 = yy * yy;
					base = x4 + y4;
					d = (float) Math.sqrt(base);
					
			System.out.print("o valor de D é " + d + ".");
	}
}
