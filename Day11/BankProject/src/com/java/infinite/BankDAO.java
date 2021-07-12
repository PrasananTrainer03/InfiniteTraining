package com.java.infinite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String withdrawAccount(int accountNo, int withdrawAmount) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Bank bank = searchAccount(accountNo);
		String message = "";
		if (bank != null) {
			int amount = bank.getAmount();
			if (amount-withdrawAmount >= 1000) {
				String cmd = "Update Bank set Amount=Amount-? Where AccountNo=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?, ?, ?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setInt(2, withdrawAmount);
				pst.setString(3, "D"); 
				pst.executeUpdate();
				message = "Amount Debited from Account...";
			} else {
				message = "Insufficient Funds...";
			}
		} else {
			message = "AccountNo NOT Found...";
		}
		return message;
	}
	public String depositAccount(int accountNo, int depositAmount) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Bank bank = searchAccount(accountNo);
		if (bank != null) {
			String cmd = "Update Bank set Amount=Amount+? Where AccountNo=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?, ?, ?)";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depositAmount);
			pst.setString(3, "C"); 
			pst.executeUpdate();
			return "Amount Credited Successfully...";
		}
		return "AccountNo Not Found...";
	}
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Bank bank = searchAccount(accountNo);
		if (bank!=null) {
			String cmd = "update bank set status='inactive' where accountNo=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account Closed Successfully...";
		} else {
			return "AccountNo Not Found...";
		}
		
	}
	
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Bank where accountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setStatus(rs.getString("status"));
		}
		return bank;
	}
	
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, State,"
				+ "Amount,CheqFacil,AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bank.getAccountNo());
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setInt(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account Created Successfully...";
	}
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1 "
				+ "  else max(accountNo)+1 END accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accountNo = rs.getInt("accno");
		return accountNo;
	}
}
