package Zoo;

public class List {
    public void animalList() {
        ZooAnimals tiger = ZooAnimals.TIGER;
        ZooAnimals elephant = ZooAnimals.ELEPHANT;
        ZooAnimals panda = ZooAnimals.PANDA;
        ZooAnimals straus = ZooAnimals.STRAUS;
        ZooAnimals peacock = ZooAnimals.PEACOCK;
        ZooAnimals goldfish = ZooAnimals.GOLDFISH;

        System.out.println("In the zoo: \n" +
                tiger.getI() + ": " + tiger.getZooAnimal() + "\n" +
                elephant.getI() + ": " + elephant.getZooAnimal() + "\n" +
                panda.getI() + ": " + panda.getZooAnimal() + "\n" +
                straus.getI() + ": " + straus.getZooAnimal() + "\n" +
                peacock.getI() + ": " + peacock.getZooAnimal() + "\n" +
                goldfish.getI() + ": " + goldfish.getZooAnimal() + "\n");

    }


}
