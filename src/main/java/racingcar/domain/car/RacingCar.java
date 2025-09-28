package racingcar.domain.car;

public class RacingCar {
    private final String name;
    private int moveCount;

    public RacingCar(String name) {
        this.name = name;
        this.moveCount = 0;
    }

    public void move() {
        moveCount++;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
