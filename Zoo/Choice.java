package Zoo;

import Animals.*;
import Bird.*;
import Fish.*;

import java.util.Scanner;

public class Choice {

    public void Choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal number: ");
        int number = scanner.nextInt();

        switch(number) {
            case 1:
                System.out.println("TIGER");
                Tiger tiger = new Tiger();
                tiger.itBreathes();
                tiger.itMoves();
                tiger.itAlsoDoes();
                System.out.println("Is dangerous: " + tiger.isDangerous());
                tiger.isEating();
                break;
            case 2:
                System.out.println("ELEPHANT");
                Elephant elephant = new Elephant();
                elephant.itBreathes();
                elephant.itMoves();
                elephant.itAlsoDoes();
                System.out.println("Is dangerous: " + elephant.isDangerous());
                elephant.isEating();
                break;
            case 3:
                System.out.println("PANDA");
                Panda panda = new Panda();
                panda.itBreathes();
                panda.itMoves();
                panda.itAlsoDoes();
                panda.isEating();
                break;
            case 4:
                System.out.println("STRAUS");
                Straus straus = new Straus();
                straus.itBreathes();
                straus.itMoves();
                straus.itAlsoDoes();
                break;
            case 5:
                System.out.println("PEACOCK");
                Peacock peacock = new Peacock();
                peacock.itBreathes();
                peacock.itMoves();
                peacock.itAlsoDoes();
                break;
            case 6:
                System.out.println("GOLDFISH");
                Goldfish goldfish = new Goldfish();
                goldfish.itBreathes();
                goldfish.itMoves();
                goldfish.itAlsoDoes();
                break;
            default:
                System.out.println("No such animal");
                break;
        }

    }
}
