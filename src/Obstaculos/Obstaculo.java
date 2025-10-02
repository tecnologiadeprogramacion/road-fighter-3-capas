package Obstaculos;

import Fabricas.Sprites;
import Juego.Entidad;
import Powerups.Misil;
import Vehiculos.Transito;
import Visitor.Colisionable;

public abstract class Obstaculo extends Entidad implements Colisionable {

	protected Obstaculo(Sprites sprites, int x, int y) {
		super(sprites, x, y);
	}

	public abstract int peso();
	public abstract int puntaje();

	public void afectar(Transito transito){
		// To DO
	}

	public void explotar(Misil misil){
		// To DO
	}
}
