package dev.Rignu1503.solid.example.I.correct;

import dev.Rignu1503.solid.example.I.correct.interfaces.Eatable;
import dev.Rignu1503.solid.example.I.correct.interfaces.Workable;


public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("El humano trabaja.");
    }

    @Override
    public void eat() {
        System.out.println("El humano come durante su descanso.");
    }
}
