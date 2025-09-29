package racingcar;

import racingcar.domain.factory.CarRegistrar;
import racingcar.domain.car.RacingCar;
import racingcar.domain.game.GameEngine;
import racingcar.domain.game.Referee;
import racingcar.domain.game.generator.NumberGenerator;
import racingcar.domain.game.generator.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarRegistrar carRegistrar = new CarRegistrar();
        NumberGenerator generator = new RandomNumberGenerator();
        GameEngine gameEngine = new GameEngine(generator);
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
                gameEngine.playTurn(car);
                OutputView.printGameRecord(car);
            }
            System.out.println();
        }

        OutputView.printWinners(referee.judge(carList));
    }
}
