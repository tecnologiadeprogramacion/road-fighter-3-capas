package Powerups;

import Fabricas.Sprites;
import Juego.Entidad;

public abstract class PowerUp extends Entidad {

	protected int puntaje;

	protected PowerUp(Sprites sprites, int x, int y, int puntaje) {
		super(sprites, x, y);
		this.puntaje = puntaje;
	}
}
