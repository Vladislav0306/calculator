import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class CalculatorLongNumberTest {
    @Test
    @DisplayName("4. Ввод длинного числа")
    public void enteringALongNumber() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(870,620);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(920,620);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(970,620);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(870,580);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(920,580);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(970,580);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(870,540);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(920,540);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        rr.mouseMove(970,540);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
        Thread.sleep(1000);
        rr.mouseMove(1050,300);
        rr.mousePress( InputEvent.BUTTON1_MASK );
        rr.mouseRelease( InputEvent.BUTTON1_MASK );
    }
}
