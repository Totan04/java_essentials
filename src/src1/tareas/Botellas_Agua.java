package src1.tareas;

import libs.Input;

public class Botellas_Agua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutos = get_negative_int();
			    
		int BotellasxMinuto = 12;
			    
		// calculate
		System.out.println("Consumo botellas agua es " + (minutos * BotellasxMinuto));

	}

	private static int get_negative_int() {
	
		int n;
	    do
	    {
	        Input.print("Minutos en la ducha: ");
	        n = Input.get_int();
	    }
	    while (n <= 0);
	    return n;		
	}

}
