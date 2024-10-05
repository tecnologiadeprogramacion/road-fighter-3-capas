package Fabricas;

import Powerups.PowerUp;

public abstract class FabricaSprites {
	
	protected String ruta_a_carpeta;
		
	protected FabricaSprites(String ruta_a_carpeta) {
		this.ruta_a_carpeta = ruta_a_carpeta;
	}
	
	public Sprite get_silueta(int numero) {
		return new Sprite(ruta_a_carpeta + "/ruta-"+numero+".png");	
	}
	
	public Sprite get_vehiculo_jugador() {
		return new Sprite(ruta_a_carpeta + "/auto.png");
	}
	
	public Sprite get_vehiculo_carrera() {
		return new Sprite(ruta_a_carpeta + "/contrincante.png");
	}
	
	public Sprite get_moto() {
		return new Sprite(ruta_a_carpeta + "/moto.png");
	}
	
	public Sprite get_auto() {
		return new Sprite(ruta_a_carpeta + "/auto.png");
	}
	
	public Sprite get_camion() {
		return new Sprite(ruta_a_carpeta + "/camion.png");
	}
	
	public Sprite get_moto(PowerUp p) {
		return new Sprite(ruta_a_carpeta + "/moto-power-up.gif");
	}
	
	public Sprite get_auto(PowerUp p) {
		return new Sprite(ruta_a_carpeta + "/auto-power-up.gif");
	}
	
	public Sprite get_camion(PowerUp p) {
		return new Sprite(ruta_a_carpeta + "/camion-power-up-1.gif");
	}
	
	public Sprite get_camion(PowerUp p1, PowerUp p2) {
		return new Sprite(ruta_a_carpeta + "/camion-power-up-2.gif");
	}
	
	public Sprite get_misil() {
		return new Sprite(ruta_a_carpeta + "/misil.png");
	}
	
	public Sprite get_nitro() {
		return new Sprite(ruta_a_carpeta + "/nitro.png");
	}
	
	public Sprite get_nafta() {
		return new Sprite(ruta_a_carpeta + "/nafta.png");
	}
	
	public Sprite get_anciana() {
		return new Sprite(ruta_a_carpeta + "/anciana.png");
	}
	
	public Sprite get_perro() {
		return new Sprite(ruta_a_carpeta + "/perro.png");
	}
	
	public Sprite get_lobo() {
		return new Sprite(ruta_a_carpeta + "/lobo.png");
	}
	
	public Sprite get_bache() {
		return new Sprite(ruta_a_carpeta + "/bache.png");
	}
}
