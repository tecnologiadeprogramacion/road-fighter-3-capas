package Obstaculos;

import Fabricas.Sprites;
import Vehiculos.Jugador;

public class Bache extends Obstaculo {

	public Bache(Sprites sprites, int x, int y) {
		super(sprites, x, y);
	}

	public int peso(){
		return 0;
	}
	
	public int puntaje(){
		return -5;
	}

	public void afectar(Jugador jugador){
		// To DO
	}
}
