package app.entities;

public class Person extends Cube {
        String name;
        int victoriesCount;

        protected int howMuchVictories() {
            return victoriesCount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", victoriesCount=" + victoriesCount +
                    '}';
        }
    }

