package com.java.infinite.ex;

class VotingException extends Exception {
	
	VotingException(String error) {
		super(error);
	}
}

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligible for voting...");
		} else {
			System.out.println("You are Elligible for voting...");
		}
	}
	public static void main(String[] args) {
		int age=17;
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			System.out.println(e.getMessage());
		}
	}
}
