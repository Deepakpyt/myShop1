package myShop1;

import java.util.Scanner;

public class Customer1 {
  Customer1(){}
	Scanner sc = new Scanner(System.in);
	String cname, adress;
	int pin_code;
	void getData() {
		System.out.println("Enter customer name: ");
		cname = sc.nextLine();
		System.out.println("Enter customer address: ");
		adress = sc.nextLine();
		System.out.println("Enter PIN code: ");
		pin_code = sc.nextInt();
		
	}
	void display() {
		System.out.println("Customer Name: "+ cname);
		System.out.println("Customer Address: "+ adress);
		System.out.println("PIN code: "+ pin_code);
	}
	

}
