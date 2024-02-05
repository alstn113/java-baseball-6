package baseball.view;

import baseball.dto.response.BaseballResultResponse;

public interface OutputView {
    void printWelcomeMessage();

    void printBaseballResult(BaseballResultResponse baseballResultResponse);

    void printGameEndMessage();
}
