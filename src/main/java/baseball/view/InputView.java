package baseball.view;

import baseball.dto.request.GameCommandRequest;
import baseball.dto.request.BaseballNumbersRequest;

public interface InputView {
    BaseballNumbersRequest readBaseballNumbers();

    GameCommandRequest readGameCommand();
}
