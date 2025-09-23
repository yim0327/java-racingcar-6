package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarRegistrar;
import racingcar.domain.GameRecord;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingGame;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarRegistrar carRegistrar = new CarRegistrar();
        RacingGame racingGame = new RacingGame();

        List<RacingCar> carList = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] registrationList = input.split(",");

        for (String car : registrationList) {
            RacingCar racingCar = carRegistrar.registerCar(car);
            carList.add(racingCar);
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            for (RacingCar car : carList) {
                racingGame.playTurn(car);
                System.out.println(new GameRecord(car));
            }
            System.out.println();
        }

    }
}
