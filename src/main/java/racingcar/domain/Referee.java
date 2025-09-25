package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {

    public List<RacingCar> judge(List<RacingCar> carList) {
        int topRank = 0;

       for (RacingCar car : carList)
           if (topRank < car.getMoveCount()) { topRank = car.getMoveCount(); }

        List<RacingCar> winners = new ArrayList<>();

        for (RacingCar car : carList)
            if (topRank == car.getMoveCount()) { winners.add(car); }

        return winners;
    }
}
