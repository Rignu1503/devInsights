package dev.Rignu1503.solid.example.L.incorrect;

public class Airplane extends Vehicule {

    @Override
    public void move() {
        // Rompe el contrato
        throw new UnsupportedOperationException("El avión no puede moverse en el suelo.");
    }
}
