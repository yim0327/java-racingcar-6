package racingcar.domain.game;

import racingcar.domain.car.RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    public List<String> judge(List<RacingCar> carList) {
        int topRank = 0;

       for (RacingCar car : carList)
           if (topRank < car.getMoveCount()) { topRank = car.getMoveCount(); }

        List<String> winners = new ArrayList<>();

        for (RacingCar car : carList)
            if (topRank == car.getMoveCount()) { winners.add(car.getName()); }

        return winners;
    }
}
