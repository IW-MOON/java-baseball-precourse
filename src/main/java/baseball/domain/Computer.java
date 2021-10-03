package baseball.domain;

import baseball.GameRule;
import nextstep.utils.Randoms;

import java.util.*;

public class Computer {

    public String generateRandomNumber() {
        Set<String> numberSet = new HashSet<>();
        while (numberSet.size() < GameRule.NUMBER_OF_DIGITS) {
            int randomNumber = Randoms.pickNumberInRange(GameRule.RANDOM_START_NUMBER, GameRule.RANDOM_END_NUMBER);
            numberSet.add(String.valueOf(randomNumber));
        }
        List<String> numberList = new ArrayList<>(numberSet);
        return String.join("", numberList.toArray(new String[GameRule.NUMBER_OF_DIGITS]));
    }
}
