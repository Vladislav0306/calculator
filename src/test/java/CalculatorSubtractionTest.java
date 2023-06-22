import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CalculatorSubtractionTest {
    @Test
    @DisplayName("9. Вычитание целых положительных чисел")
    public void subtractionOfPositiveNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870,580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("10. Вычитание целых отрицательных чисел")
    public void subtractionOfNegativeNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(970,540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("11. Вычитание дробных чисел")
    public void subtractionOfFractionalNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920,540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("12. Попытка вычесть буквы")
    public void tryingToSubtractLetters() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970, 400);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.keyPress(KeyEvent.VK_F);
        rr.keyPress(KeyEvent.VK_F);
        rr.keyPress(KeyEvent.VK_F);
        rr.keyPress(KeyEvent.VK_F);
        rr.keyPress(KeyEvent.VK_F);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1030, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("13. Попытка вычесть спецсимволы")
    public void attemptToSubtractSpecialCharacters() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970, 400);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.keyPress(KeyEvent.VK_SPACE);
        rr.keyPress(KeyEvent.VK_SPACE);
        rr.keyPress(KeyEvent.VK_SPACE);
        rr.keyPress(KeyEvent.VK_SPACE);
        rr.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1030, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("14. Попытка вычесть пустую строку")
    public void tryingToSubtractAnEmptyString() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
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
