package racingcar.domain;

public class CarRegistrar {
    private static final int MAX_NAME_LENGTH = 5;

    public RacingCar registerCar(String carName) {
        if (carName.trim().length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

        return new RacingCar(carName.trim());
    }
}
