package org.me.junit.examples;

public class Agent {

	private int agentId;
	private String firstName;
	private String lastName;
	private String city;
	private double premium;
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public Agent(int agentId, String firstName, String lastName, String city, double premium) {
		this.agentId = agentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.premium = premium;
	}
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", premium=" + premium + "]";
	}
}
