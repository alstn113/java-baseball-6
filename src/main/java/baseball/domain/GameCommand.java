package baseball.domain;

import baseball.exception.ErrorMessage;
import baseball.exception.InvalidInputException;
import java.util.Arrays;

public enum GameCommand {
    RETRY("1"),
    QUIT("2"),
    ;

    private final String command;

    GameCommand(String command) {
        this.command = command;
    }

    public static GameCommand of(String command) {
        return Arrays.stream(values())
                .filter(value -> value.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new InvalidInputException(ErrorMessage.BASEBALL_NUMBERS_DUPLICATED));
    }
}
