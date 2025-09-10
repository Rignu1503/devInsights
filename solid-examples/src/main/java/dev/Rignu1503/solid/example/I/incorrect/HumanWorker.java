package dev.Rignu1503.solid.example.I.incorrect;

import dev.Rignu1503.solid.example.I.incorrect.interfaces.Worker;

public class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("El humano trabaja.");
    }

    @Override
    public void eat() {
        System.out.println("El humano come durante su descanso.");
    }
}
