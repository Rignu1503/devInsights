package dev.Rignu1503.solid.example.L.correct;


import dev.Rignu1503.solid.example.L.correct.interfaces.Vehicule;

public class Bicycle implements Vehicule {

    @Override
    public void move() {
        System.out.println("La bicicleta avanza con pedales.");
    }
}
