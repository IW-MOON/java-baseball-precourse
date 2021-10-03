package baseball.dto;
import baseball.GameRule;

public class BaseBall {

    private int strike;
    private int ball;

    public void initStrikeAndBall() {
        setStrike(0);
        setBall(0);
    }

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }
    public void setStrike(int strike) {
        this.strike = strike;
    }
    public void setBall(int ball) {
        this.ball = ball;
    }

    public boolean isStrikeFull() {
        return getStrike() == GameRule.NUMBER_OF_DIGITS;
    }

}
