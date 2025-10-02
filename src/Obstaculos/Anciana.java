package Obstaculos;

import Fabricas.Sprites;
import Vehiculos.Jugador;

public class Anciana extends Obstaculo{
	
	public Anciana(Sprites sprites, int x, int y) {
		super(sprites, x, y);
	}

	public int peso(){
		return 50;
	}
	
	public int puntaje(){
		return -10;
	}

	public void afectar(Jugador jugador){
		// To DO
	}
}
