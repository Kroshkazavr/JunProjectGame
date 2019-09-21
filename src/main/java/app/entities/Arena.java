package app.entities;

import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Person player1 = new Person();
        Person player2 = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока ");
        player1.setName(scanner.nextLine());
        System.out.println("Введите имя второго игрока");
        player2.setName(scanner.nextLine());
        System.out.println("Для начала игры нажмите Enter");
        System.out.println("Для выхода из игры введите Exit");

        while (true) {          // в этом цикле происходит проверка на выход из игры. Для выхода необходимо ввести Exit
            boolean Exit = false;
            String tmp = scanner.nextLine();
            if ("Exit".equals(tmp)) {
                Exit = true;
                break;
            }
            if ("".equals(tmp)) {
                while (player1.victoriesCount < 3 || player2.victoriesCount < 3) {
                    if (player1.victoriesCount == 3 || player2.victoriesCount == 3) {
                        System.out.println("ПОБЕДА !!!");
                        System.out.println("Результаты игроков ");
                        System.out.print(player1.toString() + " : " + player2.toString());
                        System.out.println("");
                        try {              // в этом блоке закрываем scanner, выходим из цикла, оборабатываем исключение
                            scanner.close();
                            break;
                        } catch (IllegalStateException Ex) {
                            Ex.printStackTrace();
                        }
                    }
                    System.out.println("В БОЙ !!!");
                    System.out.println("Нажми Enter");
                    player1.createRandomNumber(scanner.nextLine()); // вызываем метод имитирующий бросание куба от игрока player1
                    System.out.println(player1.value);
                    player2.createRandomNumber(scanner.nextLine()); // вызываем метод имитирующий бросание куба от игрока player2
                    System.out.println(player2.value);

                    if (player1.value < player2.value) {
                        player2.victoriesCount++;
                        System.out.println("Выиграл игрок " + player2);
                    }
                    if (player2.value < player1.value) {
                        player1.victoriesCount++;
                        System.out.println("Выиграл игрок " + player1);
                    }
                    if (player1.value == player2.value) {      //  в случае если зачение value игроков равны, снова идём по циклу
                        System.out.println("Ничья. Кидаем снова! ");
                    }
                }
            }
        }
    }
}
