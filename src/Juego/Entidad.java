package Juego;

import Fabricas.Sprite;
import Vistas.Observer;

public abstract class Entidad implements EntidadLogica {
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected Observer observer;
	
	protected Entidad(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
	public Sprite get_sprite() {
		return sprite;
	}
	
	public int get_pos_x() {
		return x;
	}
	
	public int get_pos_y() {
		return y;
	}
	
	public void set_pos_x(int x) {
		this.x = x;
	}
	
	public void set_pos_y(int y) {
		this.y = y;
	}
	
	public void registrar_observer(Observer observer) {
		this.observer = observer;
	}
}
