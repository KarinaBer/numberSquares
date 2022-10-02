package ru.netology.javaqa.numberSquares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void findTheNumberSquareRoots() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findTheNumberSquareRootsAnotherRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(350, 450);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findTheNumberSquareRootsThirdRange() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calcSqr(10, 200);

        Assertions.assertEquals(expected, actual);
    }
}
