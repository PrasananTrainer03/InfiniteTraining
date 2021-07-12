package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNo;
		System.out.println("Enter AccountNo   ");
		accountNo = sc.nextInt();
		BankDAO dao = new BankDAO();
		try {
			Bank bank = dao.searchAccount(accountNo);
			System.out.println(bank);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
