package app.entities;

public class Arena {

    private static final int WINS_TO_END_GAME = 3;
    private final Person player1;
    private final Person player2;

    public Arena(Person player1, Person player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void makeButtle() {
        Cube cube = new Cube();
        if (player1.getVictoriesCount() < WINS_TO_END_GAME && player2.getVictoriesCount() < WINS_TO_END_GAME) {
            spotTheWinner(cube);
        } else {
            System.out.println("The battle is over with a score " + player1.getVictoriesCount() + ":" + player2.getVictoriesCount());
        }
        if (player1.getVictoriesCount() == 3) {
            System.out.println("In this battle won " + player1.getName() + "!");
        } else {
            System.out.println("In this battle won " + player2.getName() + "!");
        }
        clearPersonVictories();
    }


    private void spotTheWinner(Cube cube) {
        int numberPlayer1 = cube.createRandomNumber();
        int numberPlayer2 = cube.createRandomNumber();

        System.out.println(player1.getName() + " got " + numberPlayer1 + " points, " + player2.getName() +
                " got " + numberPlayer2 + " points.");
        if (numberPlayer1 > numberPlayer2) {
            player1.setVictoriesCount(player1.getVictoriesCount() + 1);
            System.out.println("In this round won " + player1.getName() + "!");
        }
        if (numberPlayer1 < numberPlayer2) {
            player2.setVictoriesCount(player2.getVictoriesCount() + 1);
            System.out.println("In this round won " + player2.getName() + "!");
        } else {
            System.out.println("Draw! Needs to roll the die again.");
        }

    }

    private void clearPersonVictories() {
        player1.setVictoriesCount(0);
        player2.setVictoriesCount(0);
    }
}
