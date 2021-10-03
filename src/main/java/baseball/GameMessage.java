package baseball;

public class GameMessage {

    public final static String NUMBER_INPUT_MSG = "숫자를 입력해주세요 : ";
    public final static String CORRECT_ANSWER_MSG = "게임 끝";
    public final static String CONTINUE_GAME_MSG = "게임을 새로시작하려면 1, 종료하려면 2를입력하세요";
    public final static String NOTHING_MSG = "낫싱";
    public final static String STRIKE_MSG = "스트라이크";
    public final static String BALL_MSG = "볼";
    public final static String ERR_MSG = "[ERROR]";

    public static String hitStrikeBallMsg(int strike, int ball) {
        return String.format("%d%s %d%s",  strike, GameMessage.STRIKE_MSG, ball, GameMessage.BALL_MSG);
    }
    public static String invalidInputMsg(String msg) {
        return String.format("%s %s", ERR_MSG, msg);
    }

    public static String invalidContinueInputMsg() {
        return String.format("%s %s,%s 값만 입력 가능합니다.", ERR_MSG, GameRule.GAME_CONTINUE, GameRule.GAME_END);
    }
}
