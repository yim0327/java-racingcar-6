package racingcar.view;

import racingcar.domain.car.RacingCar;

import java.util.List;

public class OutputView {

    public static void printGameRecord(RacingCar car) {
        String printBar = car.getName() + " : " + "-".repeat(car.getMoveCount());
        System.out.println(printBar);
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
