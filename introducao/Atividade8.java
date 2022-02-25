package introducao;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main(String[] args) {
		
		double cf, dist, imp, cc;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Entre com o valor de Fábrica do veículo: ");
				cf = leia.nextFloat();
			
					dist = cf * 0.28;
					imp = cf * 0.45;
					cc = cf + dist + imp;
			
			System.out.print("O valor de venda do veículo é: " + cc);
	}
}