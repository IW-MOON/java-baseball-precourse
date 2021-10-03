package baseball.domain;

import baseball.GameRule;
import baseball.dto.BaseBall;
import baseball.GameMessage;

public class GameManager {

    public String getMsgByCheckAnswer(String randomNumber, String inputNumber, BaseBall baseBall) {

        for (int index = 0; index < GameRule.NUMBER_OF_DIGITS ; index++) {
            checkAnswer(randomNumber, inputNumber, baseBall, index);
        }
        if (baseBall.getStrike() == 0 && baseBall.getBall() == 0) {
            return GameMessage.NOTHING_MSG;
        }
        return GameMessage.hitStrikeBallMsg(baseBall.getStrike(), baseBall.getBall());
    }

    public void checkAnswer(String randomNumber, String inputNumber, BaseBall baseBall, int index) {
        if(inputNumber.charAt(index) == randomNumber.charAt(index)){
            baseBall.setStrike(baseBall.getStrike() + 1);
            return;
        }
        if(randomNumber.contains(String.valueOf(inputNumber.charAt(index)))){
            baseBall.setBall(baseBall.getBall() + 1);
        }
    }

}
