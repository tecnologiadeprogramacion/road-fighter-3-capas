package Vehiculos;

import Fabricas.Sprite;
import Powerups.PowerUp;

public abstract class Transito extends Vehiculo {
	
	protected PowerUp power_up;
	
	protected Transito(Sprite sprite, int x, int y, float peso, String patente, int velocidad) {
		super(sprite, x, y, peso, patente, velocidad);
	}
	
	protected Transito(Sprite sprite, int x, int y, float peso, String patente, int velocidad, PowerUp power_up) {
		super(sprite, x, y, peso, patente, velocidad);
		this.power_up = power_up;
	}
}
