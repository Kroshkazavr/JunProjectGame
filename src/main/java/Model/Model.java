package Model;

import app.entities.Person;

public class Model {

    private static Model instance;

    private Person player1;
    private Person player2;

    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void addPlayer1(Person person) {
        this.player1 = person;
    }

    public void addPlayer2(Person person) {
        this.player2 = person;
    }

    public Person getPlayer1() {
        return player1;
    }

    public Person getPlayer2() {
        return player2;
    }
}
