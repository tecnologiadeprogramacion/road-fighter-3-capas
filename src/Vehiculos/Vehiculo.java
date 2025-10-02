package Vehiculos;

import Fabricas.Sprites;
import Juego.Entidad;

public abstract class Vehiculo extends Entidad{
	
	protected int velocidad;
	protected float peso;
	protected String patente;
	
	protected Vehiculo(Sprites sprites, int x, int y, int velocidad, float peso, String patente) {
		super(sprites, x, y);
		this.velocidad = velocidad;
		this.peso = peso;
		this.patente = patente;
	}
	
	public int get_velocidad() {
		return velocidad;
	}

	public float get_peso() {
		return peso;
	}
	
	public String get_patente() {
		return patente;
	}
}
