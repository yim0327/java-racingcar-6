package racingcar.view;

import racingcar.domain.GameRecord;
import racingcar.domain.ResultView;

public class OutputView {

    public static void printGameRecord(GameRecord gameRecord) {
        System.out.println(gameRecord);
    }

    public static void printWinners(ResultView result) {
        System.out.println(result);
    }
}
