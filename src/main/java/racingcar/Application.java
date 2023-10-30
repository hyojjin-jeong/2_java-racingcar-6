package racingcar;
import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static List<String> CarName(String input) {
        String[] tokens = input.split(",");
        List<String> result = new ArrayList<>();

        for (String token : tokens) {
            result.add(token.trim());
        }

        return result;
    }
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)");
        String input = Console.readLine();
        List<String> cars = CarName(input);

    }
}
