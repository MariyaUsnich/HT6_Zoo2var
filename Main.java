import Animals.Elephant;
import Animals.Panda;
import Animals.Tiger;
import Bird.Peacock;
import Bird.Straus;
import Fish.Goldfish;
import Zoo.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        (new List()).animalList();

        System.out.println("Enter animal number: ");
        int number = (new Scanner(System.in)).nextInt();

        reactOnChoice(number);
    }

    public static void reactOnChoice(int number) {
        switch (number) {
            case 1 -> {
                System.out.println("TIGER");
                Tiger tiger = new Tiger();
                tiger.itBreathes();
                tiger.itMoves();
                tiger.itAlsoDoes();
                System.out.println("Is dangerous: " + tiger.isDangerous());
                tiger.isEating();
            }
            case 2 -> {
                System.out.println("ELEPHANT");
                Elephant elephant = new Elephant();
                elephant.itBreathes();
                elephant.itMoves();
                elephant.itAlsoDoes();
                System.out.println("Is dangerous: " + elephant.isDangerous());
                elephant.isEating();
            }
            case 3 -> {
                System.out.println("PANDA");
                Panda panda = new Panda();
                panda.itBreathes();
                panda.itMoves();
                panda.itAlsoDoes();
                panda.isEating();
            }
            case 4 -> {
                System.out.println("STRAUS");
                Straus straus = new Straus();
                straus.itBreathes();
                straus.itMoves();
                straus.itAlsoDoes();
            }
            case 5 -> {
                System.out.println("PEACOCK");
                Peacock peacock = new Peacock();
                peacock.itBreathes();
                peacock.itMoves();
                peacock.itAlsoDoes();
            }
            case 6 -> {
                System.out.println("GOLDFISH");
                Goldfish goldfish = new Goldfish();
                goldfish.itBreathes();
                goldfish.itMoves();
                goldfish.itAlsoDoes();
            }
            default -> System.out.println("No such animal");
        }
    }
}
