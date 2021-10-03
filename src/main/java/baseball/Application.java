package baseball;

import baseball.domain.Client;
import baseball.domain.Computer;
import baseball.domain.GameManager;
import baseball.dto.BaseBall;
import baseball.validation.InputValidationCheck;

public class Application {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Client client = new Client();
        GameManager gameManager = new GameManager();
        Application application = new Application();
        while (client.isActive()){
            application.playGame(computer, client, gameManager);
            System.out.println(GameMessage.CORRECT_ANSWER_MSG);
            application.checkContinueGame(client);
        }
    }

    private void playGame(Computer computer, Client client, GameManager gameManager) {
        BaseBall baseBall = new BaseBall();
        String randomNumber = computer.generateRandomNumber();
        while (!baseBall.isStrikeFull()) {
            baseBall.initStrikeAndBall();
            String inputNumber = getGameNumber(client);
            System.out.println(gameManager.getMsgByCheckAnswer(randomNumber, inputNumber, baseBall));
        }
    }

    private void checkContinueGame(Client client) {
        System.out.println(GameMessage.CONTINUE_GAME_MSG);
        String inputNumber = client.getClientInput();
        try{
            boolean isGameContinue = InputValidationCheck.isContinueGameCheck(inputNumber);
            client.setActive(isGameContinue);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            checkContinueGame(client);
        }
    }

    private String getGameNumber(Client client) {
        System.out.print(GameMessage.NUMBER_INPUT_MSG);
        String inputNumber = client.getClientInput();
        //System.out.println("inputNumber = " + inputNumber);
        try {
            InputValidationCheck.gameNumberValidationCheck(inputNumber);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return getGameNumber(client);
        }
        return inputNumber;
    }
}
