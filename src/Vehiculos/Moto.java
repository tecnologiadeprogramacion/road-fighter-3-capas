package Vehiculos;

import Fabricas.Sprite;
import Powerups.PowerUp;

public class Moto extends Transito{
	
	public Moto(Sprite sprite, int x, int y, String patente) {
		super(sprite, x, y, 70, patente, 80);
	}
	
	public Moto(Sprite sprite, int x, int y, String patente, PowerUp power_up) {
		super(sprite, x, y, 70, patente, 80, power_up);
	}
}