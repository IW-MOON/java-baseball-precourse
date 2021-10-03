package baseball.domain;

import baseball.GameMessage;
import baseball.dto.BaseBall;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

public class GameManagerTest {

    @DisplayName("입력 값에 대해 스트라이크/볼/낫싱 테스트를 한다.")
    @ParameterizedTest
    @CsvSource(value = {"123:123:3:0", "491:274:0:1", "491:273:0:0"}, delimiter = ':')
    void 스트라이크_볼_확인(String randomNumber, String inputNumber, int strike, int ball) {
        // given
        BaseBall baseBall = new BaseBall();
        GameManager gameManager = new GameManager();
        // when
        String msg = gameManager.getMsgByCheckAnswer(randomNumber, inputNumber, baseBall);
        // then
        assertThat(msg).isEqualTo(GameMessage.hitStrikeBallMsg(strike, ball));
    }
}
