package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.List;

public class OutputView {

    public static void printGameRecord(RacingCar car) {
        String printBar = car.getName() + " : " + "-".repeat(car.getMoveCount());
        System.out.println(printBar);
    }

    public static void printWinners(List<RacingCar> winners) {
        String result = "최종 우승자 :";

        for (RacingCar car : winners) {
            result += " " + car.getName() + "," ;
        }

        System.out.println(result + "\b");
    }
}
