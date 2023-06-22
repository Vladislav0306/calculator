import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CalculatorAddingTest {
    @Test
    @DisplayName("1. Сложение целых положительных чисел")
    public void additionOfPositiveNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(920, 580);
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
    @DisplayName("2. Сложение целых отрицательных чисел")
    public void additionOfNegativeNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(870, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1000, 540);
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
    @DisplayName("3. Сложение дробных чисел")
    public void additionOfFractionalNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 580);
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
    @DisplayName("5. Сложение 999999999 и 1")
    public void adding999999999And1() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(970, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870, 620);
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
    @DisplayName("6. Попытка сложить буквы")
    public void tryingToPutLettersTogether() throws AWTException, InterruptedException {
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
        rr.mouseMove(1050, 620);
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
    @DisplayName("7. Попытка сложить спецсимволы")
    public void attemptToAddSpecialCharacters() throws AWTException, InterruptedException {
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
        rr.mouseMove(1050, 620);
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
    @DisplayName("8. Попытка сложить пустую строку")
    public void tryingToAddAnEmptyString() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
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

    @Test
    @DisplayName("33. Сложение нескольких чисел")
    public void addingMultipleNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(920,540);
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
}