import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CalculatorMultiplicationTest {
    @Test
    @DisplayName("15. Умножение целых положительных чисел")
    public void multiplicationOfPositiveNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(870,580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870,540);
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
    @DisplayName("16. Умножение целых отрицательных чисел")
    public void multiplicationOfNegativeNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(920,540);
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
    @DisplayName("17. Умножение дробных чисел")
    public void multiplicationOfFractionalNumbers() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(920, 620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870,620);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(1000, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        rr.mouseMove(870,620);
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
    @DisplayName("18. Умножение 999999999 и 999999999")
    public void multiplication999999999And999999999() throws AWTException, InterruptedException {
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
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
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
        rr.mouseMove(1050, 700);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 300);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Test
    @DisplayName("19. Умножение на 0")
    public void multiplyBy0() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(920,680);
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
    @DisplayName("20. Умножение на 1")
    public void multiplyBy1() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920,580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(870,620);
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
    @DisplayName("21. Попытка умножить буквы")
    public void tryingToMultiplyLetters() throws AWTException, InterruptedException {
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
        rr.mouseMove(1050, 540);
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
    @DisplayName("22. Попытка умножить спецсимволы")
    public void attemptToMultiplySpecialCharacters() throws AWTException, InterruptedException {
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
        rr.mouseMove(1050, 540);
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
    @DisplayName("23. Попытка умножить пустую строку")
    public void tryingToMultiplyAnEmptyString() throws AWTException, InterruptedException {
        Calculator.main();
        Robot rr = new Robot();
        rr.mouseMove(920, 580);
        rr.mousePress(InputEvent.BUTTON1_MASK);
        rr.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        rr.mouseMove(1050, 540);
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
