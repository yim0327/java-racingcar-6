package racingcar;

import racingcar.domain.*;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarRegistrar carRegistrar = new CarRegistrar();
        RacingGame racingGame = new RacingGame();
        Referee referee = new Referee();

        List<RacingCar> carList = new ArrayList<>();

        String[] registrationList = InputView.inputRacingCar();

        for (String car : registrationList) {
            RacingCar racingCar = carRegistrar.registerCar(car);
            carList.add(racingCar);
        }

        int tryCount = InputView.inputTryCount();

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            for (RacingCar car : carList) {
                racingGame.playTurn(car);
                OutputView.printGameRecord(new GameRecord(car));
            }
            System.out.println();
        }

        ResultView result = referee.judge(carList);
        OutputView.printWinners(result);
    }
}
