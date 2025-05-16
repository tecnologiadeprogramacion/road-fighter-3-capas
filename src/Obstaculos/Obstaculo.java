package Obstaculos;

import Fabricas.Sprite;
import Juego.Entidad;

public abstract class Obstaculo extends Entidad {

	protected Obstaculo(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}
}
