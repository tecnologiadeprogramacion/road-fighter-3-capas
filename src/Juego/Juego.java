package Juego;

import java.util.List;

import Fabricas.FabricaEntidades;
import Fabricas.FabricaSprites;
import Fabricas.FabricaSpritesOriginales;
import Grafica.ControladorGrafica;
import Grafica.Observer;
import Parser.GeneradorRuta;
import Vehiculos.Jugador;

public class Juego {
	
	protected ControladorGrafica controlador_grafica;
	protected GeneradorRuta generador_ruta;
	protected FabricaSprites fabrica_sprites;
	protected FabricaEntidades fabrica_entidades;
	protected Ruta ruta_actual;
	
	public Juego(ControladorGrafica controlador_grafica) {
		this.controlador_grafica = controlador_grafica;
		fabrica_sprites = new FabricaSpritesOriginales();
		fabrica_entidades = new FabricaEntidades(fabrica_sprites);
		generador_ruta = new GeneradorRuta(fabrica_entidades);
	}
	
	// Operaciones para launcher
		
	public void configurar(){
		controlador_grafica.mostrar_pantalla_inicial();
	}

	// Operaciones de interfaz ControladorGrafica
	
	public void iniciar() {
		ruta_actual = generador_ruta.generar_ruta(1);
		registrar_observers();
		controlador_grafica.mostrar_pantalla_carrera();
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
		Observer observer_jugador = controlador_grafica.registrar_entidad(vehiculo_jugador);
		vehiculo_jugador.registrar_observer(observer_jugador);
	}
	
	protected void registrar_observer_silueta(Silueta silueta_ruta) {
		Observer observer = controlador_grafica.registrar_silueta(silueta_ruta);
		silueta_ruta.registrar_observer(observer);
	}
	
	protected void registrar_observers_para_entidades(List<? extends Entidad> entidades) {
		for(Entidad entidad : entidades) {
			Observer observer = controlador_grafica.registrar_entidad(entidad);
			entidad.registrar_observer(observer);
		}
	}
}
