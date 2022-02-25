package introducao;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
		int anos, meses, dias, anos2d, meses2d, dias2d;
	
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Digite quantos anos de idade você tem: ");
				anos = leia.nextInt();
			System.out.print("Agora, Digite quantos meses de idade você tem: ");
				meses = leia.nextInt();
			System.out.print("E por ultimo. Digite quantos dias de idade você tem: ");
				dias = leia.nextInt();
		
					anos2d = anos * 365;
					meses2d = meses * 30;
					dias2d = dias + meses2d + anos2d;
			
			System.out.print("Seu tempo de vida em dias é "+
			dias2d + ", ta velha em amigue!!!");
	}
}
	