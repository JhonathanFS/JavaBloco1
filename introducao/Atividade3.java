package introducao;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		int seg, hora, min, horaResto, minResto;
		
		Scanner leia = new Scanner(System.in);
			
				System.out.print("Quantos segundos durou o evento: ");
					seg = leia.nextInt();
				
						min = seg / 60;
						minResto = seg % 60;
						hora = min / 60;
						horaResto = min % 60;
		
				System.out.print("O evento durou " + hora + " horas, "+
				horaResto + " minutos e " + minResto + " segundos.");
	}
}
	