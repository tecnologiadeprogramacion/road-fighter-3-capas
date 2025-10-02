package Vehiculos;

import Fabricas.Sprites;

public class Carrera extends Vehiculo {

	protected int posicion;

	public Carrera(Sprites sprites, int x, int y, float peso, String patente) {
		super(sprites, x, y, 110, peso, patente);
		this.posicion = 0;
	}

	public void set_posicion(int posicion){
		this.posicion = posicion;
	}

	public int get_posicion(){
		return posicion;
	}
}
