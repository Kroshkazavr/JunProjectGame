package app.entities;

public class Person extends Cube {

    private String name;
    private int victoriesCount;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getVictoriesCount() {
        return victoriesCount;
    }

    public void setVictoriesCount(int victoriesCount) {
        this.victoriesCount = victoriesCount;
    }

    public Person createRandomPerson() {
        return new Person("Компьютер");
    }
}

