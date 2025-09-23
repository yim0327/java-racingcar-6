package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;
    private static final int REFERENCE_POINT = 4;

    public void playTurn(RacingCar car) {
        int tmp = Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);

        if (tmp >= REFERENCE_POINT) { car.move(); }
    }
}
