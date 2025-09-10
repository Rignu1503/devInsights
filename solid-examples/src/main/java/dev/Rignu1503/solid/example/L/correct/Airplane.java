package dev.Rignu1503.solid.example.L.correct;


import dev.Rignu1503.solid.example.L.correct.interfaces.Vehicule;

public class Airplane implements Vehicule {

    @Override
    public void move() {
        System.out.println("El avión se desplaza por el aire.");
    }
}
