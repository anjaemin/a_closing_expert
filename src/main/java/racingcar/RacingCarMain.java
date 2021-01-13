package racingcar;

import racingcar.model.RacingGame;
import racingcar.view.InputView;

public class RacingCarMain {
    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame();

        racingGame.readGame(InputView.inputCars(), InputView.inputAttempt());
        racingGame.playGame();
    }

}
