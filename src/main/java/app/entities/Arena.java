package app.entities;

import java.util.Scanner;

public class Arena {

    private Person player1;
    private Person player2;

    public Arena(Person player1, Person player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void makeButtle() {
        Cube cube = new Cube();
        while (player1.getVictoriesCount() != 3 || player2.getVictoriesCount() != 3) {
            spotTheWinner(cube);
        }
        System.out.println("Битва закончена со счетом " + player1.getVictoriesCount() + ":" + player2.getVictoriesCount());
        if (player1.getVictoriesCount() == 3) {
            System.out.println("В этой битве победил " + player1.getName() + "!");
        } else {
            System.out.println("В этой битве победил " + player2.getName() + "!");
        }
        clearPersonVictories();
    }


    private void spotTheWinner(Cube cube) {
        int numberPlayer1 = cube.createRandomNumber();
        int numberPlayer2 = cube.createRandomNumber();

        System.out.println("У " + player1.getName() + " выпало " + numberPlayer1 + ", у " + player2.getName() +
                " выпало " + numberPlayer2);
        if (numberPlayer1 > numberPlayer2) {
            player1.setVictoriesCount(player1.getVictoriesCount() + 1);
            System.out.println("В этом раунде победил " + player1.getName() + "!");
        }
        if (numberPlayer1 < numberPlayer2) {
            player2.setVictoriesCount(player2.getVictoriesCount() + 1);
            System.out.println("В этом раунде победил " + player2.getName() + "!");
        } else {
            System.out.println("Ничья! Бросаем кубик снова.");
        }

    }

    private void clearPersonVictories() {
        player1.setVictoriesCount(0);
        player2.setVictoriesCount(0);
    }
}
