package Launcher;

import java.awt.EventQueue;

import Juego.Juego;
import Vistas.ControladorVistas;


public class Launcher {
	
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego juego = new Juego();
					ControladorVistas controlador_vistas = new ControladorVistas(juego);
					juego.set_controlador_vistas(controlador_vistas);
					controlador_vistas.mostrar_pantalla_inicial();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
