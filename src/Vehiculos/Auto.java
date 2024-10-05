package Vehiculos;

import Fabricas.Sprite;
import Powerups.PowerUp;

public class Auto extends Transito {
	
	public Auto(Sprite sprite, int x, int y, String patente) {
		super(sprite, x, y, 150, patente, 160);
	}
	
	public Auto(Sprite sprite, int x, int y, String patente, PowerUp power_up) {
		super(sprite, x, y, 150, patente, 160, power_up);
	}
}
