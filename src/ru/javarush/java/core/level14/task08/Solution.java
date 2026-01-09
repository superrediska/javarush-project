package ru.javarush.java.core.level14.task08;

public class Solution {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Максим", 1000000);
        BankAccount bankAccount1 = new BankAccount("Вика");
        bankAccount1.deposit(500);
        // Открываем счёт с заданным начальным балансом
        bankAccount.printInfo();
        bankAccount1.printInfo();

        // Открываем счёт только с именем (баланс будет установлен в 0)


        // Пополняем второй счёт на 500 единиц


        // Выводим информацию о каждом счёте

    }
}
class BankAccount{
    String accountOwner;
    int accountBalance;
    BankAccount(String accountOwner, int accountBalance){
        this.accountBalance = accountBalance;
        this.accountOwner = accountOwner;
    }
    BankAccount(String accountOwner){
        this(accountOwner, 0);

    }
    void deposit(int value){
        accountBalance += value;
    }

    void printInfo(){
        System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
    }
}
// Класс банковского счёта с владельцем и текущим балансом