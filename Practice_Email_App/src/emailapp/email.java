package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName; 
	private String lastName; 
	private String password; 
	private String department; 
	private int mailboxCapacity;
	private String altEmail; 
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
		System.out.println("EMAIL CREATED " + this.firstName + " " + this.lastName);
		//Call a method asking for the department
		
}
	
	//Ask for the department
	private String setDepartment() {
	System.out.println("Enter the department /n 1 for Sales /n 2 for Development /n 3 for Creative /n 4 for none");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if (depChoice == 1) {return "sales";}
	else if (depChoice == 2) {return "devteam";}
	else if (depChoice == 3) {return "creative";}
	else { return " ";}
	}
	
	
		
	//Generate a random password
	
	//Set the mailbox capacity
	private String mailboxMessage;
	void mailboxMessage() {System.out.println("Mailbox Capacity Reached");}
	private String setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
		mailboxCapacity = 1200;
		if (mailboxCapacity > 1200) {return mailboxMessage;}
		}}
	//Set the alternate email
	
	//Change the password
	
	

