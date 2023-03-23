package com.bridgelabz;
import java.util.Scanner;
public class Bank {
    int balance,accno,cabalance=70000;
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :- ");
        int depositamount=sc.nextInt();
        cabalance=cabalance+depoamount;
        System.out.println("Your current balance is "+cabalance);


    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int withdrawAmount=sc.nextInt();
        cabalance=cabalance-withdrawAmount;
        System.out.println("your current balance is " +cabalance);
    }

    public static void main(String[] args) {
        Banking obj2 = new Banking();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want \n 1)Deposit \n 2)Withdraw");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1: {
                ba.deposit();
                break;
            }
            case 2:
            {
                ba.withdraw();
                break;
            }
        }
    }
}

