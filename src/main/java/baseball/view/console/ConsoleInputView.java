package baseball.view.console;

import baseball.dto.request.BaseballNumbersRequest;
import baseball.dto.request.GameCommandRequest;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleInputView implements InputView {

    @Override
    public BaseballNumbersRequest readBaseballNumbers() {
        System.out.print("숫자를 입력해주새요 : ");
        String input = Console.readLine();
        return new BaseballNumbersRequest(input);
    }

    @Override
    public GameCommandRequest readGameCommand() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        return new GameCommandRequest(input);
    }
}
