package baseball.domain;

public record BaseballResult(int strike, int ball) {
    public boolean isMatch() {
        return strike == Baseball.NUMBERS_COUNT;
    }
}
