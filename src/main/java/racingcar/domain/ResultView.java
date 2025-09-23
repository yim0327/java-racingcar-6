package racingcar.domain;

import java.util.List;

public class ResultView {
    private List<RacingCar> winners;

    public ResultView(List<RacingCar> winners) {
        this.winners = winners;
    }

    @Override
    public String toString() {
        String result = "최종 우승자 :";

        for (RacingCar car : winners) {
            result += " " + car.getName() + "," ;
        }

        return result + "\b";
    }
}
