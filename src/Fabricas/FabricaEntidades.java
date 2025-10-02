package Fabricas;

import Juego.Silueta;
import Obstaculos.Anciana;
import Obstaculos.Bache;
import Obstaculos.Lobo;
import Obstaculos.Perro;
import Powerups.Misil;
import Powerups.Nafta;
import Powerups.Nitro;
import Powerups.PowerUp;
import Vehiculos.Auto;
import Vehiculos.Camion;
import Vehiculos.Carrera;
import Vehiculos.Jugador;
import Vehiculos.Moto;

public class FabricaEntidades {
	
	protected FabricaSprites fabrica_sprites;
	
	public FabricaEntidades(FabricaSprites fabrica_sprites) {
		this.fabrica_sprites = fabrica_sprites;
	}
	
	public Silueta get_silueta(int numero_ruta) {
		Sprites sprites_silueta = fabrica_sprites.get_silueta(numero_ruta);
		Silueta silueta = new Silueta(sprites_silueta);
		return silueta;
	}
	
	public Jugador get_vehiculo_jugador(int x, int y, float peso, String patente) {
		Sprites sprites_vehiculo_jugador = fabrica_sprites.get_vehiculo_jugador();
		Jugador vehiculo_jugador = new Jugador(sprites_vehiculo_jugador, x, y, peso, patente);
		return vehiculo_jugador;
	}
	
	public Carrera get_vehiculo_carrera(int x, int y, float peso, String patente) {
		Sprites sprites_vehiculo_carrera = fabrica_sprites.get_vehiculo_carrera();
		Carrera vehiculo_carrera = new Carrera(sprites_vehiculo_carrera, x, y, peso, patente);
		return vehiculo_carrera;
	}
	
	public Moto get_moto(int x, int y, String patente) {
		Sprites sprites_moto = fabrica_sprites.get_moto();
		Moto moto = new Moto(sprites_moto, x, y, patente);
		return moto;
	}
	
	public Auto get_auto(int x, int y, String patente) {
		Sprites sprites_auto = fabrica_sprites.get_auto();
		Auto auto = new Auto(sprites_auto, x, y, patente);
		return auto;
	}
	
	public Camion get_camion(int x, int y, String patente) {
		Sprites sprites_camion = fabrica_sprites.get_camion();
		Camion camion = new Camion(sprites_camion, x, y, patente);
		return camion;
	}
	
	public Moto get_moto(int x, int y, String patente, PowerUp power_up) {
		Sprites sprites_moto = fabrica_sprites.get_moto(power_up);
		Moto moto = new Moto(sprites_moto, x, y, patente, power_up);
		return moto;
	}
	
	public Auto get_auto(int x, int y, String patente, PowerUp power_up) {
		Sprites sprites_auto = fabrica_sprites.get_auto(power_up);
		Auto auto = new Auto(sprites_auto, x, y, patente, power_up);
		return auto;
	}
	
	public Camion get_camion(int x, int y, String patente, PowerUp power_up) {
		Sprites sprites_camion = fabrica_sprites.get_camion(power_up);
		Camion camion = new Camion(sprites_camion, x, y, patente, power_up);
		return camion;
	}
	
	public Camion get_camion(int x, int y, String patente, PowerUp power_up_1, PowerUp power_up_2) {
		Sprites sprites_camion = fabrica_sprites.get_camion(power_up_1, power_up_2);
		Camion camion = new Camion(sprites_camion, x, y, patente, power_up_1, power_up_2);
		return camion;
	}
	
	public Misil get_misil(int x, int y) {
		Sprites sprites_misil = fabrica_sprites.get_misil();
		Misil misil = new Misil(sprites_misil, x, y);
		return misil;
	}
	
	public Nitro get_nitro(int x, int y) {
		Sprites sprites_nitro = fabrica_sprites.get_nitro();
		Nitro nitro = new Nitro(sprites_nitro, x, y);
		return nitro;
	}
	
	public Nafta get_nafta(int x, int y) {
		Sprites sprites_nafta = fabrica_sprites.get_nafta();
		Nafta nafta = new Nafta(sprites_nafta, x, y);
		return nafta;
	}
	
	public Anciana get_anciana(int x, int y) {
		Sprites sprites_anciana = fabrica_sprites.get_nafta();
		Anciana anciana = new Anciana(sprites_anciana, x, y);
		return anciana;
	}
	
	public Perro get_perro(int x, int y) {
		Sprites sprites_perro = fabrica_sprites.get_perro();
		Perro perro = new Perro(sprites_perro, x, y);
		return perro;
	}
	
	public Lobo get_lobo(int x, int y) {
		Sprites sprites_lobo = fabrica_sprites.get_lobo();
		Lobo lobo = new Lobo(sprites_lobo, x, y);
		return lobo;
	}
	
	public Bache get_bache(int x, int y) {
		Sprites sprites_bache = fabrica_sprites.get_bache();
		Bache bache = new Bache(sprites_bache, x, y);
		return bache;
	}
}
