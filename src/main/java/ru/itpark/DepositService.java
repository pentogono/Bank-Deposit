package ru.itpark;

public class DepositService {
    public int calculateDeposit(int deposit, int termOfDeposit, int interestRate) {

        int hundredPercent = 100;
        int monthYear = 12;
        int oneMonth = 1;
        int result;

        if (termOfDeposit == monthYear) {
            result = (deposit * (hundredPercent + interestRate)) / hundredPercent;
        } else if (termOfDeposit == oneMonth) {
            result = (((deposit * interestRate) / monthYear) / hundredPercent) + deposit;
        } else {
            result = (((deposit * interestRate) / monthYear) / hundredPercent) * termOfDeposit + deposit;
        }

        return result;
    }


}

