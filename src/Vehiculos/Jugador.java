package Vehiculos;

import java.util.LinkedList;
import java.util.List;

import Fabricas.Sprite;
import Juego.EntidadJugador;
import Powerups.Misil;
import Vistas.Observer;

public class Jugador extends Carrera implements EntidadJugador {

	protected List<Misil> mis_misiles;
	protected int combustible;
	protected int puntaje;
	protected Observer observer;
	
	public Jugador(Sprite sprite, int x, int y, float peso, String patente) {
		super(sprite, x, y, peso, patente);
		velocidad = 90;
		mis_misiles = new LinkedList<Misil>();
		combustible = 100;
		puntaje = 0;
	}
	
	public List<Misil> get_misiles(){
		return mis_misiles;
	}

	public int get_combustible() {
		return combustible;
	}

	public int get_puntaje() {
		return puntaje;
	}
	
	public void registrar_observer(Observer observer) {
		this.observer = observer;
	}
}
