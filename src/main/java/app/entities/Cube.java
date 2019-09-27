package app.entities;

public class Cube {

    public int createRandomNumber() {
        return CubeNumbers.MIN_CUBE_NUMBER.getNumber()
                + (int) (Math.random() * CubeNumbers.MAX_CUBE_NUMBER.getNumber());
    }
}


