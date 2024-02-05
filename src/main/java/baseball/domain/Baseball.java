package baseball.domain;

import baseball.exception.ErrorMessage;
import baseball.exception.InvalidInputException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baseball {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public static final int NUMBERS_COUNT = 3;
    private final List<Integer> numbers;

    public Baseball(List<Integer> numbers) {
        validateNumberRange(numbers);
        validateNumberLength(numbers);
        validateNumberDuplicate(numbers);
        this.numbers = new ArrayList<>(numbers);
    }

    private void validateNumberRange(List<Integer> numbers) {
        if (numbers.stream().anyMatch(number -> number > MAX_NUMBER || number < MIN_NUMBER)) {
            throw new InvalidInputException(ErrorMessage.BASEBALL_INVALID_RANGE);
        }
    }

    private void validateNumberDuplicate(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != NUMBERS_COUNT) {
            throw new InvalidInputException(ErrorMessage.BASEBALL_NUMBERS_DUPLICATED);
        }
    }

    private void validateNumberLength(List<Integer> numbers) {
        if (numbers.size() != NUMBERS_COUNT) {
            throw new InvalidInputException(ErrorMessage.BASEBALL_INVALID_LENGTH);
        }
    }

    public BaseballResult compare(Baseball other) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < NUMBERS_COUNT; i++) {
            List<Integer> otherNumbers = other.getNumbers();
            if (numbers.get(i).equals(otherNumbers.get(i))) {
                strike++;
                continue;
            }
            if (otherNumbers.contains(numbers.get(i))) {
                ball++;
            }
        }

        return new BaseballResult(strike, ball);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
