package app.entities;

public enum CubeNumbers {
    MIN_CUBE_NUMBER(1), MAX_CUBE_NUMBER(6);

    int number;

    CubeNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
