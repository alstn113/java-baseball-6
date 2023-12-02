package baseball.view.console;

import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleInputView implements InputView {
    @Override
    public String readBaseballNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    @Override
    public String readRetryOrEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }
}
