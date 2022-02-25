package introducao;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		int dias, meses, anos, restoAnos, restoMes;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.print("Digite quantos dias de vida você tem: ");
				dias = leia.nextInt();
			
					anos = dias / 365;
					restoAnos = dias % 365;
					meses = restoAnos / 30;
					restoMes = restoAnos % 30;
			
			System.out.print("São " + anos + " anos, " + meses+
							" meses e " + restoMes + " dias.");
	}
}
