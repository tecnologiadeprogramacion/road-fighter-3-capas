package Visitor;

import Vehiculos.Jugador;
import Vehiculos.Transito;

public interface Colisionable {
    public void afectar(Jugador jugador);
    public void afectar(Transito transito);
}
