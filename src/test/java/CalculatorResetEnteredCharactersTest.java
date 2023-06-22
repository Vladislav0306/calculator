import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class CalculatorResetEnteredCharactersTest {
    @Test
    @DisplayName("41. Сброс введённых символов")
    public void resetEnteredCharacters() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("42. Сброс введённых символов 6 раз")
    public void resetEnteredCharacters6Times() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870, 480);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
