package Zoo;

public enum ZooAnimals {
    TIGER(1,"Tiger"),
    ELEPHANT(2, "Elephant"),
    PANDA(3, "Panda"),
    STRAUS(4, "Straus"),
    PEACOCK(5, "Peacock"),
    GOLDFISH(6, "Goldfish");
    private int i;
    private String zooAnimal;

    ZooAnimals(int i, String zooAnimal) {
        this.i = i;
        this.zooAnimal = zooAnimal;
    }

    public int getI(){
        return i;
    }

    public String getZooAnimal() {
        return zooAnimal;
    }
}
