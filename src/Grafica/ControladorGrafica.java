package Grafica;

import Juego.Juego;
import Juego.EntidadJugador;
import Juego.EntidadLogica;

public interface ControladorGrafica {
	public void registrar_controlador_juego(Juego juego);
    public void mostrar_pantalla_inicial();
    public void mostrar_pantalla_carrera();
	public void mostrar_pantalla_fin_juego();
	public Observer registrar_entidad(EntidadLogica entidad_logica);
	public Observer registrar_entidad(EntidadJugador entidad_jugador);
	public Observer registrar_silueta(EntidadLogica silueta);
}
