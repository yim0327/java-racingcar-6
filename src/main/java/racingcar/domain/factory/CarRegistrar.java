package racingcar.domain.factory;

import racingcar.domain.car.RacingCar;

public class CarRegistrar {
    private static final int MAX_NAME_LENGTH = 5;

    public RacingCar registerCar(String carName) {
        String name = carName.trim();

        if (name.isEmpty())
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");

        if (name.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");

        return new RacingCar(name);
    }
}
