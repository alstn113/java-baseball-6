package baseball.dto.request;

import baseball.domain.Baseball;
import baseball.exception.ErrorMessage;
import baseball.exception.InvalidInputException;
import java.util.ArrayList;
import java.util.List;

public record BaseballNumbersRequest(String input) {
    public Baseball toBaseball() {
        List<Integer> numbers = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidInputException(ErrorMessage.INPUT_NOT_A_NUMBER);
            }
            numbers.add(Character.getNumericValue(c));
        }
        return new Baseball(numbers);
    }
}