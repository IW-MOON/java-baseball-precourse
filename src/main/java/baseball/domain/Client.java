package baseball.domain;

import nextstep.utils.Console;


public class Client {

    private boolean isActive = true;
    public String getClientInput() {
        return Console.readLine();
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
}
