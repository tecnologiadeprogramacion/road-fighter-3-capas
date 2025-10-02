package Vehiculos;

import Fabricas.Sprites;
import Powerups.PowerUp;

public class Auto extends Transito {
	
	public Auto(Sprites sprites, int x, int y, String patente) {
		super(sprites, x, y, 160, 150, patente);
	}
	
	public Auto(Sprites sprites, int x, int y, String patente, PowerUp mi_power_up) {
		super(sprites, x, y, 160, 150, patente, mi_power_up);
	}
}
