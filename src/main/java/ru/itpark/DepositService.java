package ru.itpark;

public class DepositService {
    public int calculateDeposit(int deposit, int termOfDeposit, int interestRate) {
        int hundredPercent = 100;
        int monthYear = 12;
        int oneMonth = 1;
        if (termOfDeposit == monthYear) {
            return   (deposit * (hundredPercent + interestRate)) / hundredPercent;
        } else if (termOfDeposit == oneMonth) {
            return   deposit * interestRate / monthYear / hundredPercent + deposit;
        } else {
            return  ((deposit * interestRate / monthYear) / hundredPercent) * termOfDeposit + deposit;
        }
    }
}

