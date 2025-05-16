package Vehiculos;

import Fabricas.Sprite;
import Powerups.PowerUp;

public class Camion extends Transito {
	
	protected PowerUp mi_otro_power_up;
	
	public Camion(Sprite sprite, int x, int y, String patente) {
		super(sprite, x, y, 2000, patente, 90);
	}
	
	public Camion(Sprite sprite, int x, int y, String patente, PowerUp power_up) {
		super(sprite, x, y, 2000, patente, 90, power_up);
	}
	
	public Camion(Sprite sprite, int x, int y, String patente, PowerUp power_up_1, PowerUp Power_up_2) {
		super(sprite, x, y, 2000, patente, 90, power_up_1);
		this.mi_otro_power_up = power_up;
	}
}
