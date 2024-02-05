package baseball.config;

import baseball.controller.BaseballController;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.console.ConsoleInputView;
import baseball.view.console.ConsoleOutputView;

public class AppConfig {
    private AppConfig() {
    }

    public static InputView consoleInputView() {
        return new ConsoleInputView();
    }

    public static OutputView consoleOutputView() {
        return new ConsoleOutputView();
    }


    public static BaseballController baseballController() {
        return new BaseballController(
                consoleInputView(),
                consoleOutputView()
        );
    }
}
