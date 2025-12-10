package test;
import java.util.*;
public class ATMmain {
	public static void main(String[] args) {
		int balance = 20000;
		int withdraw; 
		int deposit;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.withdraw:");
		System.out.println("2.deposit:");
		System.out.println("3.checkbalance:");
		System.out.println("4.pin Change:");
		System.out.println("Enter The Choice:");
		int choice = sc.nextInt();
		System.out.println("Enter the PinNo..");
		int pinNo = sc.nextInt();
		CheckPinNo cpn = new CheckPinNo();
		 boolean k  = cpn.verify(pinNo);
		 if(k) {
		switch(choice) {
		case 1: 
			System.out.println("Enter The  withdraw Amount:");
			int wd = sc.nextInt();
			withdraw  = balance - wd;
			System.out.println("Withdraw :"+wd+":rs/.");
			System.out.println("Avilable balance:"+withdraw+":rs/.");
			System.out.println("Withdraw Sucessfully:");
			break;
		case 2 :
			System.out.println("Enter the Deposit amount:");
			int d = sc.nextInt();
			deposit = balance + d;
			System.out.println("Deposited :"+d+":rs/.");
			System.out.println("Avilable balance:"+deposit+":rs/.");
			System.out.println("Deposited Sucessfully:");
			break;
		case 3 :
			System.out.println("available balance:"+balance+":rs/.");
			break;	
		case 4:
			System.out.println("Enter The new Pin:");
			int pinNo1 = sc.nextInt();
			pinNo = pinNo1;		
			System.out.println("Pin Changed Sucessfully");
			break;
			
		default :
               System.out.println("Invalid Choice"); 
               break;
		}
		 }
		else {
			 System.out.println("Invalid pinNo..");
		 }
		  }
		}
	


