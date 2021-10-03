package baseball.validation;


import baseball.GameMessage;
import baseball.GameRule;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InputValidationCheck {

    private InputValidationCheck() {

    }
    public static void gameNumberValidationCheck(String inputNumber)  {
        if(inputNumber.length() != 3
                || isDuplicateNumber(inputNumber)
                || !inputNumber.matches("["+ GameRule.RANDOM_START_NUMBER + "-" + GameRule.RANDOM_END_NUMBER + "]{" + GameRule.NUMBER_OF_DIGITS +"}")
        ){
            throw new IllegalArgumentException(GameMessage.invalidInputMsg("3자리 수 중복되지 않는 수로 입력해주세요."));
        }
    }

    private static boolean isDuplicateNumber(String inputNumber) {
        Set<String> convertedSet = new HashSet<String>(Arrays.asList(inputNumber.split("")));
        return convertedSet.size() != GameRule.NUMBER_OF_DIGITS;
    }

}
