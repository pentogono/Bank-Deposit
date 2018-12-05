package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void calculateDeposit1() {
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1_000, 12, 8);
            assertEquals(1_080, bankDeposit);
        }
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1_000, 1, 8);
            assertEquals(1_006, bankDeposit);
        }
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1_000, 6, 8);
            assertEquals(1_036, bankDeposit);
        }
    }
}
