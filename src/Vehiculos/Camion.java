package Vehiculos;

import Fabricas.Sprites;
import Powerups.PowerUp;

public class Camion extends Transito {
	
	protected PowerUp mi_otro_power_up;
	
	public Camion(Sprites sprites, int x, int y, String patente) {
		super(sprites, x, y, 90, 2000, patente);
	}
	
	public Camion(Sprites sprites, int x, int y, String patente, PowerUp mi_power_up) {
		super(sprites, x, y, 90, 2000, patente, mi_power_up);
	}
	
	public Camion(Sprites sprites, int x, int y, String patente, PowerUp mi_power_up_, PowerUp mi_otro_power_up) {
		super(sprites, x, y, 90, 2000, patente, mi_otro_power_up);
		this.mi_otro_power_up = mi_otro_power_up;
	}

	public float masa(){
		// To DO
		return 0;
	}
}
