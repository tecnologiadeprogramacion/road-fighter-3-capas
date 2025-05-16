package Vehiculos;

import Fabricas.Sprite;
import Juego.Entidad;

public abstract class Vehiculo extends Entidad{
	
	protected float peso;
	protected String patente;
	protected int velocidad;
	
	protected Vehiculo(Sprite sprite, int x, int y, float peso, String patente, int velocidad) {
		super(sprite, x, y);
		this.peso = peso;
		this.patente = patente;
		this.velocidad = velocidad;
	}
	
	public float get_peso() {
		return peso;
	}
	
	public String get_patente() {
		return patente;
	}
	
	public int get_velocidad() {
		return velocidad;
	}
}
