package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.BaseballResult;
import baseball.domain.Computer;
import baseball.domain.GameCommand;
import baseball.dto.request.BaseballNumbersRequest;
import baseball.dto.request.GameCommandRequest;
import baseball.dto.response.BaseballResultResponse;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController implements Controller {
    private final InputView inputView;
    private final OutputView outputView;


    public BaseballController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    @Override
    public void run() {
        Computer computer = new Computer();
        outputView.printWelcomeMessage();

        do {
            play(computer);
        } while (readGameCommand() == GameCommand.RETRY);
    }

    private void play(Computer computer) {
        computer.generateAnswer();
        BaseballResult result;

        do {
            Baseball baseball = readBaseballNumbers();
            result = baseball.compare(computer.getAnswer());
            outputView.printBaseballResult(BaseballResultResponse.from(result));
        } while (!result.isMatch());

        outputView.printGameEndMessage();
    }

    private Baseball readBaseballNumbers() {
        BaseballNumbersRequest dto = inputView.readBaseballNumbers();
        return dto.toBaseball();
    }

    private GameCommand readGameCommand() {
        GameCommandRequest dto = inputView.readGameCommand();
        return dto.toGameCommand();
    }
}
