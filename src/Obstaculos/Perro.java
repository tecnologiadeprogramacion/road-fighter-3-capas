package Obstaculos;

import Fabricas.Sprites;
import Vehiculos.Jugador;

public class Perro extends Obstaculo {

	public Perro(Sprites sprites, int x, int y) {
		super(sprites, x, y);
	}

	public int peso(){
		return 20;
	}
	
	public int puntaje(){
		return -50;
	}

	public void afectar(Jugador jugador){
		// To DO
	}
}
