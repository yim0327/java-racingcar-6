package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarRegistrar;
import racingcar.domain.RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarRegistrar carRegistrar = new CarRegistrar();

        List<RacingCar> carList = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] registrationList = input.split(",");

        for (String car : registrationList) {
            RacingCar racingCar = carRegistrar.registerCar(car);
            carList.add(racingCar);
        }

    }
}
