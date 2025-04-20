package principal;

import entidades.Jugador;
import utilidades.Utilidades;
import entidades.Dado;

public class Principal {

	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		boolean win = false;
		boolean crap = false;
		boolean siete = false;
		int
		
		System.out.println("Bienvenido! Ingrese su nombre para empezar a jugar");
		String nombre = Utilidades.s.nextLine();
		Jugador jugador1 = new Jugador(nombre);
	
		
		do {
			win = false;
			crap = false;
			siete = false;
			
			jugador1.lanzarDado(dado1);
			jugador1.lanzarDado(dado2);
			
			int tirada = sumarResultados(dado1, dado2);
			
			if(tirada == 7 || tirada == 11) win = true;
			if(tirada == 2 || tirada == 3 || tirada == 12) crap = true;
			
			
			
		}while(!crap && !siete && !win);
		
	}

	private static int sumarResultados(Dado dado1, Dado dado2) {
		int resultado = dado1.cara + dado2.cara;
		return resultado;
	}
}
