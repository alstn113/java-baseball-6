package baseball.view.console;

import baseball.view.OutputView;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    @Override
    public void printRoundResult() {
        System.out.println("1볼 1스트라이크");
    }

    @Override
    public void printGameEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
