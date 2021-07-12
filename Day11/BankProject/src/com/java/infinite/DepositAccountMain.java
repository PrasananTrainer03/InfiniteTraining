package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No  ");
		int accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount   ");
		int depositAmount = sc.nextInt();
		BankDAO dao = new BankDAO();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
