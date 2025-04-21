package principal;

import interfaces.Partida;

public class Principal {

	public static void main(String[] args) {
		Partida partida1 = new Partida();
		boolean resultado = partida1.jugar();
		partida1.mostrarResultados(resultado);
	}
}
