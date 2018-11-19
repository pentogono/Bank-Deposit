package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void calculateDeposit1() {
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1000,12,8);
            assertEquals(1080,bankDeposit);
        }
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1000,1,8);
            assertEquals(1007,bankDeposit);
        }
        {
            DepositService service = new DepositService();
            int bankDeposit = service.calculateDeposit(1000,6,8);
            assertEquals(1040,bankDeposit);
        }
    }
    }
