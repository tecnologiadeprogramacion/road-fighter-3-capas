package Vehiculos;

import Fabricas.Sprites;
import Powerups.PowerUp;
import Visitor.Colisionable;
import Visitor.Colisionador;

public abstract class Transito extends Vehiculo implements Colisionador, Colisionable {
	
	protected PowerUp mi_power_up;
	
	protected Transito(Sprites sprites, int x, int y, int velocidad, float peso, String patente) {
		super(sprites, x, y, velocidad, peso, patente);
	}
	
	protected Transito(Sprites sprites, int x, int y, int velocidad, float peso, String patente, PowerUp mi_power_up) {
		super(sprites, x, y, velocidad, peso, patente);
		this.mi_power_up = mi_power_up;
	}

	public float masa(){
		// To DO
		return 0;
	}

	public void chocar(Colisionable colisionable){
		colisionable.afectar(this);
	}

	public void afectar(Jugador jugador){}

    public void afectar(Transito transito){}
}
