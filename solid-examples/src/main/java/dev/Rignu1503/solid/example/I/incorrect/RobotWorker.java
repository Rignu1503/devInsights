package dev.Rignu1503.solid.example.I.incorrect;

import dev.Rignu1503.solid.example.I.incorrect.interfaces.Worker;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("El robot trabaja sin descanso.");
    }

    @Override
    public void eat() {
        //Problema: un robot no necesita comer
        throw new UnsupportedOperationException("El robot no necesita comer.");
    }
}
