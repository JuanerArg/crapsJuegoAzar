package entidades;

import java.util.Random;

public class Jugador {
	private Random random = new Random();
	@SuppressWarnings("unused")
	private String nombreJugador;
	public Dado dado1 = new Dado();
	public Dado dado2 = new Dado();
	
	public Jugador(String nombre, Dado dado1, Dado dado2) {
		this.nombreJugador = nombre;
		this.dado1 = dado1;
		this.dado2 = dado2;
	}
	
	public void lanzarDados() {
		this.dado1.cara = random.nextInt(6) + 1;
		this.dado2.cara = random.nextInt(6) + 1;
	}
}
