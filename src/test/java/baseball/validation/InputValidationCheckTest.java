package baseball.validation;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class InputValidationCheckTest {

    @DisplayName("사용자로부터 입력받은 숫자가 중복되지 않는 3자리 정수임을 검증한다.")
    @ParameterizedTest
    @CsvSource(value = {"13", "ab1", "9999", "ddd", "211", "013"})
    void 게임_사용자입력검증_실패(String inputNumber) {
        assertThrows(IllegalArgumentException.class, () -> InputValidationCheck.gameNumberValidationCheck(inputNumber));
    }

    @DisplayName("사용자로부터 입력받은 숫자가 중복되지 않는 3자리 정수임을 검증한다.")
    @ParameterizedTest
    @CsvSource(value = {"123", "781", "371"})
    void 게임_사용자입력검증_성공(String inputNumber) {
        assertThatCode(() -> InputValidationCheck.gameNumberValidationCheck(inputNumber)).doesNotThrowAnyException();
    }

    @DisplayName("게임 종료 후 사용자로부터 입력받은 값이 1,2 외의 값임을 검증한다.")
    @ParameterizedTest
    @CsvSource(value = {"3", "a"})
    void 계속_사용자임력검증_실패(String inputNumber) {
        assertThrows(IllegalArgumentException.class, () -> InputValidationCheck.isContinueGameCheck(inputNumber));
    }

    @DisplayName("게임 종료 후 사용자로부터 입력받은 값이 1,2 외의 값임을 검증한다.")
    @ParameterizedTest
    @CsvSource(value = {"1", "2"})
    void 계속_사용자임력검증_성공(String inputNumber) {
        assertThatCode(() -> InputValidationCheck.isContinueGameCheck(inputNumber)).doesNotThrowAnyException();
    }


}
