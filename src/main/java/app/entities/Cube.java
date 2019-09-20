package app.entities;

public class Cube {
        private int one = 1;
        private int maxpoint = 9;
        protected int value;

        int createRandomNumber(String xxx) {    // метод при вводе xxx выводит значение от 1 до 9
            System.out.println("Бросаю куб");
            value = one + (int) (Math.random() * maxpoint);
            return value;
        }
    }

