package interfaces;

import entidades.Dado;
import entidades.Jugador;
import utilidades.Utilidades;

public class Partida {
	private Dado dado1 = new Dado();
	private Dado dado2 = new Dado();
	
	private String nombre = ingresarNombre();
	Jugador jugador1 = new Jugador(nombre, dado1, dado2);
	
	public boolean jugar() {
		boolean win = false;
		boolean crap = false;
		boolean siete = false;
		int punto = 0;
		int numeroDeTirada = 0;
		boolean resultado = false;
		
		do {
			win = false;
			crap = false;
			siete = false;
			
			jugador1.lanzarDados();
			
			int tirada = sumarResultados(jugador1.dado1, jugador1.dado2);
						
			if((tirada == 7 || tirada == 11) && numeroDeTirada == 0) {
				win = true; 
				resultado = true;
			}
			if((tirada == 2 || tirada == 3 || tirada == 12) && numeroDeTirada == 0) {
				crap = true;
				resultado = false;
			}
			if(numeroDeTirada == 0 && win == false && crap == false) punto = tirada;
			if(numeroDeTirada > 0 && tirada == 7) {
				siete = true;
				resultado = false;
			}
			if(numeroDeTirada > 0 && tirada == punto ) {
				win = true;
				resultado = true;
			}
			
			numeroDeTirada++;
		}while(!crap && !siete && !win);
		
		return resultado;
	}
	
	private String ingresarNombre() {
		System.out.println("Bienvenido! Ingrese su nombre para empezar a jugar");
		return Utilidades.s.nextLine();
	}
	
	private int sumarResultados(Dado dado1, Dado dado2) {
		int resultado = dado1.cara + dado2.cara;
		System.out.println("Salio" + resultado);
		return resultado;
	}
	
	public void mostrarResultados(boolean resultado) {
		System.out.println(resultado ? "Ganaste" : "Perdiste");
	}
}
