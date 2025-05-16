package Powerups;

import Fabricas.Sprite;
import Juego.Entidad;

public abstract class PowerUp extends Entidad {

	protected PowerUp(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}
}
