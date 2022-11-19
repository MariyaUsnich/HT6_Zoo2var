package Fish;

import Interface.Action;

public class Fish implements Action {
    @Override
    public void itBreathes() {System.out.println("It breathes with the gills.");

    }

    @Override
    public void itMoves() { System.out.println("It swims.");
    }
}
