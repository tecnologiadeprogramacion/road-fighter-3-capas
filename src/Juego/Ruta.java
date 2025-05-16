package Juego;

import java.util.LinkedList;
import java.util.List;

import Obstaculos.Obstaculo;
import Powerups.PowerUp;
import Vehiculos.Carrera;
import Vehiculos.Jugador;
import Vehiculos.Transito;

public class Ruta {
	
	protected int numero;
	protected Silueta silueta;
	protected Jugador vehiculo_jugador;
	protected List<Carrera> vehiculos_carrera;
	protected List<Transito> vehiculos_transito;
	protected List<Obstaculo> obstaculos;
	protected List<PowerUp> power_ups;
	
	public Ruta(Silueta silueta, int numero) {
		this.numero = numero;
		this.silueta = silueta;
		vehiculos_carrera = new LinkedList<Carrera>();
		vehiculos_transito = new LinkedList<Transito>();
		obstaculos = new LinkedList<Obstaculo>();
		power_ups = new LinkedList<PowerUp>();
	}
	
	public int get_numero() {
		return numero;
	}
	
	public Silueta get_silueta(){
		return silueta;
	}

	public Jugador get_vehiculo_jugador() {
		return vehiculo_jugador;
	}
	
	public List<Carrera> get_vehiculos_carrera(){
		return vehiculos_carrera;
	}
	
	public List<Transito> get_vehiculos_transito(){
		return vehiculos_transito;
	}
	
	public List<Obstaculo> get_obstaculos(){
		return obstaculos;
	}
	
	public List<PowerUp> get_power_ups(){
		return power_ups;
	}
	
	public void agregar_jugador(Jugador jugador) {
		vehiculo_jugador = jugador;
	}
	
	public void agregar_vehiculo_carrera(Carrera vehiculo_carrera) {
		vehiculos_carrera.addLast(vehiculo_carrera);
	}
	
	public void agregar_vehiculo_transito(Transito vehiculo_transito) {
		vehiculos_transito.addLast(vehiculo_transito);
	}
	
	public void agregar_obstaculo(Obstaculo obstaculo) {
		obstaculos.addLast(obstaculo);
	}
	
	public void agregar_power_up(PowerUp power_up) {
		power_ups.addLast(power_up);
	}
}
