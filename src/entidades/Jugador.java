package entidades;

import java.util.Random;

public class Jugador {
	private Random random = new Random();
	private String nombre;
	private Dado dado = new Dado();
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public void lanzarDado(Dado dado) {
		dado.cara = random.nextInt(6) + 1;
		System.out.println("Salio" + dado.cara);
	}
}
