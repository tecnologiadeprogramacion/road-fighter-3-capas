package Juego;

import java.util.List;

import Fabricas.FabricaEntidades;
import Fabricas.FabricaSprites;
import Fabricas.FabricaSpritesOriginales;
import Parser.GeneradorRuta;
import Vehiculos.Jugador;
import Vistas.ControladorEntreJuegoVista;
import Vistas.Observer;

public class Juego {
	
	protected ControladorEntreJuegoVista controlador_vistas;
	protected GeneradorRuta generador_ruta;
	protected FabricaSprites fabrica_sprites;
	protected FabricaEntidades fabrica_entidades;
	protected Ruta ruta_actual;
	
	public Juego() {
		fabrica_sprites = new FabricaSpritesOriginales();
		fabrica_entidades = new FabricaEntidades(fabrica_sprites);
		generador_ruta = new GeneradorRuta(fabrica_entidades);
	}
	
	// Operaciones para launcher
	
	public void set_controlador_vistas(ControladorEntreJuegoVista controlador_vistas) {
		this.controlador_vistas = controlador_vistas;
	}
	
	// Operaciones de interfaz ControladorEntreJuegoVista
	
	public void iniciar() {
		ruta_actual = generador_ruta.generar_ruta(1);
		registrar_observers();
		controlador_vistas.mostrar_pantalla_carrera();
	}
	
	protected void registrar_observers() {
		registrar_observer_jugador(ruta_actual.get_vehiculo_jugador());
		registrar_observer_silueta(ruta_actual.get_silueta());
		registrar_observers_para_entidades(ruta_actual.get_vehiculos_carrera());
		registrar_observers_para_entidades(ruta_actual.get_vehiculos_transito());
		registrar_observers_para_entidades(ruta_actual.get_obstaculos());
		registrar_observers_para_entidades(ruta_actual.get_power_ups());
	}
	
	protected void registrar_observer_jugador(Jugador vehiculo_jugador) {
		Observer observer_jugador = controlador_vistas.registrar_entidad(vehiculo_jugador);
		vehiculo_jugador.registrar_observer(observer_jugador);
	}
	
	protected void registrar_observer_silueta(Silueta silueta_ruta) {
		Observer observer = controlador_vistas.registrar_silueta(silueta_ruta);
		silueta_ruta.registrar_observer(observer);
	}
	
	protected void registrar_observers_para_entidades(List<? extends Entidad> entidades) {
		for(Entidad entidad : entidades) {
			Observer observer = controlador_vistas.registrar_entidad(entidad);
			entidad.registrar_observer(observer);
		}
	}
}
