package baseball.domain;

import baseball.domain.generator.BaseballNumbersGenerator;
import baseball.domain.generator.BaseballRandomNumbersGenerator;
import java.util.List;

public class Computer {
    private final BaseballNumbersGenerator generator;
    private Baseball answer;

    public Computer(BaseballNumbersGenerator generator) {
        this.generator = generator;
    }

    public Computer() {
        generator = new BaseballRandomNumbersGenerator();
    }

    public void generateAnswer() {
        List<Integer> numbers = generator.generate();
        answer = new Baseball(numbers);
    }

    public Baseball getAnswer() {
        return answer;
    }
}
