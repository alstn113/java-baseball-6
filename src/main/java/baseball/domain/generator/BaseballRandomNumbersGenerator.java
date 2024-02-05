package baseball.domain.generator;

import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BaseballRandomNumbersGenerator implements BaseballNumbersGenerator {

    @Override
    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < Baseball.NUMBERS_COUNT) {
            int randomNumber = Randoms.pickNumberInRange(Baseball.MIN_NUMBER, Baseball.MAX_NUMBER);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
