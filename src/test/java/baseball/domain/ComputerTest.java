package baseball.domain;

import baseball.GameRule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    @DisplayName("컴퓨터가 생성한 숫자가 정의된 3자리 수인지 확인한다.")
    @Test
    void 컴퓨터생성_3자리_확인() {
        // given
        Computer computer = new Computer();
        // when
        String computerNumber = computer.generateRandomNumber();
        // then
        assertThat(computerNumber.length()).isEqualTo(GameRule.NUMBER_OF_DIGITS);
    }

    @DisplayName("컴퓨터가 생성한 숫자가 중복이 없는지 확인한다.")
    @Test
    void 컴퓨터생성_중복_확인() {
        // given
        Computer computer = new Computer();
        List<String> computerNumberList = new ArrayList<>();
        // when && then
        for (int i = 0; i < 100000; i++) {
            String computerNumber = computer.generateRandomNumber();
            List<String> numberList = convertStrToList(computerNumber);
            Set<String> numberSet = new HashSet<String>(numberList);
            assertThat(numberSet.size()).isEqualTo(numberList.size());
        }
    }

    List<String> convertStrToList(String str) {
        List<String> convertList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            convertList.add(String.valueOf(str.charAt(i)));
        }
        return convertList;
    }

}
