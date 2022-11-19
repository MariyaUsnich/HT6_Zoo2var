package Animals;
import Interface.*;

public class Animal implements Action {

    @Override
    public void itBreathes() {
        System.out.println("It breathes with the lungs.");
    }

    @Override
    public void itMoves() {
        System.out.println( "It Goes, runs, jumps.");
    }

    }
