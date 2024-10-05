package Parser;

import Fabricas.FabricaEntidades;
import Juego.Ruta;
import Juego.Silueta;
import Powerups.Nafta;

public class GeneradorRuta {
	
	protected FabricaEntidades fabrica_entidades;
	
	public GeneradorRuta(FabricaEntidades fabrica_entidades) {
		this.fabrica_entidades = fabrica_entidades;
	}
	
	public void cambiar_fabrica_entidades(FabricaEntidades fabrica_entidades) {
		this.fabrica_entidades = fabrica_entidades;
	}
	
	public Ruta generar_ruta(int numero) {
		// To DO
		return generar_ruta_harcoding(numero);
	}
	
	protected Ruta generar_ruta_harcoding(int numero) {
		String patente = "AAA-111";
		float peso = 1;
		
		Silueta silueta = fabrica_entidades.get_silueta(numero);
		Ruta ruta = new Ruta(silueta, numero);
		ruta.agregar_jugador(fabrica_entidades.get_vehiculo_jugador(200, 75, peso, patente));
		ruta.agregar_vehiculo_carrera(fabrica_entidades.get_vehiculo_carrera(350, 75, peso, patente));
		ruta.agregar_vehiculo_carrera(fabrica_entidades.get_vehiculo_carrera(300, 125, peso, patente));
		ruta.agregar_vehiculo_carrera(fabrica_entidades.get_vehiculo_carrera(350, 200, peso, patente));
		ruta.agregar_vehiculo_transito(fabrica_entidades.get_moto(300, 275, patente));
		ruta.agregar_vehiculo_transito(fabrica_entidades.get_camion(350, 325, patente));
		Nafta nafta = fabrica_entidades.get_nafta(300, 400);
		ruta.agregar_vehiculo_transito(fabrica_entidades.get_camion(300, 400, patente, nafta));
		ruta.agregar_vehiculo_transito(fabrica_entidades.get_camion(350, 475, patente, nafta, nafta));
		ruta.agregar_obstaculo(fabrica_entidades.get_perro(300, 525));
		return ruta;
	}
}
