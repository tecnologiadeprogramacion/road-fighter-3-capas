package Vehiculos;

import Fabricas.Sprites;
import Powerups.PowerUp;

public class Moto extends Transito{
	
	public Moto(Sprites sprites, int x, int y, String patente) {
		super(sprites, x, y,80, 70, patente);
	}
	
	public Moto(Sprites sprites, int x, int y, String patente, PowerUp mi_power_up) {
		super(sprites, x, y, 80, 70, patente, mi_power_up);
	}
}