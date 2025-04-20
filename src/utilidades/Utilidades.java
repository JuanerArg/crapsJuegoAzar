package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
	public static Scanner s = new Scanner(System.in);
	
	public static int ingresarEntero(Scanner s, final int MIN, final int MAX) {
		int numero = 0;
		boolean error = false;
		if(MIN > MAX) {
			System.err.println("[ERROR] Error fatal, el minimo no puede ser mayor que el maximo nunca");
		}
		
		do {
			
			try {
				numero = s.nextInt();
				
			}catch(InputMismatchException e) {
				System.err.println("[ERROR] Ingrese un valor entero");
				error = true;
				
			}catch(Exception e) {
				System.err.println("[ERROR] Error inesperado, llame a soporte tecnico");
				error = true;
				
			}
			
		}while(!error);
		
		return numero;
	}
}
