package baseball.dto.response;

import baseball.domain.BaseballResult;

public record BaseballResultResponse(int strike, int ball) {
    public static BaseballResultResponse from(BaseballResult baseballResult) {
        int strike = baseballResult.strike();
        int ball = baseballResult.ball();
        return new BaseballResultResponse(strike, ball);
    }
}
