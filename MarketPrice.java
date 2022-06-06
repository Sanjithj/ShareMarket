package com.bridgelabz;

import java.util.Scanner;

public class MarketPrice {

	public static void main(String[] args) {
		System.out.println("Enter to the Stock Market");
		
		Scanner scan =new Scanner(System.in);
		StockAccount objStockAccount = new StockAccount();
		
		while(true) {
			System.out.println("1.buying the shares\n 2.selling the shares\n" + "3.credit account\n 4.debit account\n"
								+"5.account balance\n 6.portfolio details\n 7.exit");
			System.out.print("Enter the choice: ");
			int ch = scan.nextInt();
			int amount;
			String symbol;
			switch(ch) {
			case 1:
				System.out.println("Enter the stock you want to buy");
				symbol = scan.next();
				System.out.println("Enter the value of worth of share to be sold: ");
				amount = scan.nextInt();
				objStockAccount.buy(amount, symbol);
				break;
			case 2:
				System.out.println("Enter the stock you want to sell");
				symbol = scan.next();
				System.out.println("Enter the value of worth of share to be sold: ");
				amount = scan.nextInt();
				objStockAccount.sell(amount, symbol);
				break;
			case 3:
				System.out.println("Enter the amount need to credit into the account: ");
				amount = scan.nextInt();
				AccountMain.credit(amount);
				break;
			case 4:
				System.out.println("Enter the amount need to debit from the account: ");
				amount = scan.nextInt();
				AccountMain.debit(amount);
				break;
			case 5:
				objStockAccount.valueOf();
				break;
			case 6:
				objStockAccount.printReport();
				break;
			}
		}
		
	}
}
