package baseball.view.console;

import baseball.dto.response.BaseballResultResponse;
import baseball.view.OutputView;

public class ConsoleOutputView implements OutputView {

    @Override
    public void printWelcomeMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    @Override
    public void printBaseballResult(BaseballResultResponse baseballResultResponse) {
        int strike = baseballResultResponse.strike();
        int ball = baseballResultResponse.ball();

        StringBuilder messageString = new StringBuilder();

        if (ball > 0) {
            messageString.append(ball).append("볼");
        }

        if (ball > 0 && strike > 0) {
            messageString.append(" ");
        }

        if (strike > 0) {
            messageString.append(strike).append("스트라이크");
        }

        if (ball == 0 && strike == 0) {
            messageString.append("낫싱");
        }

        System.out.println(messageString);
    }

    @Override
    public void printGameEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
