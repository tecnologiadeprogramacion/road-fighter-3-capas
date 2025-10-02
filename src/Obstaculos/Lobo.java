package Obstaculos;

import Fabricas.Sprites;
import Vehiculos.Jugador;

public class Lobo extends Perro {

	public Lobo(Sprites sprites, int x, int y) {
		super(sprites, x, y);
	}

	public int peso(){
		return super.peso() * 2;
	}

	public void afectar(Jugador jugador){
		// To DO
	}
}
