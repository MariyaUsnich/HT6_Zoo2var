package Bird;

import Interface.Action;

public class Bird implements Action {
    @Override
    public void itBreathes() {
        System.out.println("It breathes with the lungs.");

    }
    @Override
    public void itMoves() { System.out.println("It flies, goes");
    }
}
