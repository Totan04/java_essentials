package src1.tareas;

import libs.Input;

public class MarioFacilFunciones {

	public static void main(String[] args) {
		
		int altura = getAltura();
		dibujarPiramide(altura);

	}

	

	private static int getAltura() {
		int n;
	    do
	    {
	        Input.print("Áltura Piramide: ");
	        n = Input.get_int();
	        if (n <= 0)
	        	Input.print("Valor no valido, intente de nuevo: ");
	    }
	    while (n <= 0);
	    return n;
	}
	
	private static void dibujarPiramide(int altura) {
		// TODO Auto-generated method stub
		//System.out.println();
		for(int numRenglon = 1; numRenglon <= altura;numRenglon++ ) {
			dibujarRenglon(numRenglon, altura);
		}
	}



	private static void dibujarRenglon(int numRenglon, int altura) {
		dibujarEspacios(numRenglon, altura);
		dibujarGatos(numRenglon, altura);
		
	}



	private static void dibujarEspacios(int numRenglon, int altura) {
		int numero_de_espacios = altura-numRenglon;
		for(int i = 1; i <= numero_de_espacios ; i ++)
		{
			System.out.print(" ");
		}
		
	}



	private static void dibujarGatos(int numRenglon, int altura) {
		int numGatos = numRenglon + 1;
		for (int numeral = 1; numeral <= numGatos; numeral++)
		{
			System.out.print("#");
			
		}
		
		System.out.println();	
		
	}

}
