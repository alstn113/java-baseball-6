package baseball.dto.request;

import baseball.domain.GameCommand;

public record GameCommandRequest(String input) {
    public GameCommand toGameCommand() {
        return GameCommand.of(input);
    }
}
