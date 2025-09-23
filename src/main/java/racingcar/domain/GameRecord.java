package racingcar.domain;

public class GameRecord {
    private final String name;
    private final int moveCount;

    public GameRecord(RacingCar car) {
        this.name = car.getName();
        this.moveCount = car.getMoveCount();
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(moveCount);
    }
}
