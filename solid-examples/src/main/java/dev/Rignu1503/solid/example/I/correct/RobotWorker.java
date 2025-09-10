package dev.Rignu1503.solid.example.I.correct;

import dev.Rignu1503.solid.example.I.correct.interfaces.Workable;
import dev.Rignu1503.solid.example.I.incorrect.interfaces.Worker;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("El robot trabaja sin descanso.");
    }
}

