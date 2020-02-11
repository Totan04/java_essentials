package src1.tareas;

import libs.Input;

	public class Mario_Dificil {

		public static void main(String[] args) {
			
			System.out.print("Indica la altura de la piramide: ");
			int altura = Input.get_int();
			int a = 0;
			String caracteres = "";

			for(int num = 0; num <= altura ; num ++) {
				String espacios = "";
					
				    for(int ren = a; ren != altura-1; ren++ ) {
						espacios = espacios + " ";
					}
					
					caracteres = caracteres + "#";
					a = a + 1;

				System.out.println(espacios + caracteres + "  " + caracteres);
			}
			
			
		}

	}
