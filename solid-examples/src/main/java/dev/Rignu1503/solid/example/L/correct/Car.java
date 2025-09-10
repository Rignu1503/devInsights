package dev.Rignu1503.solid.example.L.correct;

import dev.Rignu1503.solid.example.L.correct.interfaces.Vehicule;

public class Car implements Vehicule {

    @Override
    public void move() {
        System.out.println("El carro avanza en la carretera.");
    }
}
