import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class CalculatorRemoveEnteredCharactersTest {
    @Test
    @DisplayName("39. Удаление введённых символов")
    public void deletingEnteredCharacters() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,540);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(920,540);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        Thread.sleep(1000);
        rr.mouseMove(970,480);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        Thread.sleep(1000);
        rr.mouseMove(1050,300);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
    }

    @Test
    @DisplayName("40. Удаление пустой строки")
    public void removingAnEmptyLine() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970,480);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        Thread.sleep(1000);
        rr.mouseMove(1030, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
