package racingcar.domain.game;

import racingcar.domain.car.RacingCar;
import racingcar.domain.game.generator.NumberGenerator;

public class GameEngine {
    private static final int REFERENCE_POINT = 4;
    private final NumberGenerator generator;

    public GameEngine(NumberGenerator generator) {
        this.generator = generator;
    }

    public void playTurn(RacingCar car) {
        int number = generator.generate();
        if (number >= REFERENCE_POINT) { car.move(); }
    }
}
