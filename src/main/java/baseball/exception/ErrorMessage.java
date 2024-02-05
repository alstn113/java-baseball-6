package baseball.exception;

import baseball.domain.Baseball;

public enum ErrorMessage {
    INPUT_NOT_A_NUMBER("입력값은 숫자여야 합니다."),

    BASEBALL_INVALID_RANGE(String.format("%d ~ %d 사이의 숫자를 입력하세요.", Baseball.MIN_NUMBER, Baseball.MAX_NUMBER)),
    BASEBALL_INVALID_LENGTH(String.format("%d자리 숫자를 입력하세요.", Baseball.NUMBERS_COUNT)),
    BASEBALL_NUMBERS_DUPLICATED("중복되지 않은 숫자를 입력하세요."),

    INVALID_GAME_COMMAND("옳바르지 않은 명령어입니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
