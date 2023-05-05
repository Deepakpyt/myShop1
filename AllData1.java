package myShop1;

import java.util.Scanner;

public class AllData1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String fname;
		int choice, f_petals, f_pieces;
		float f_price;
		
        do {
            System.out.println("\nMenu");
            System.out.println("1. Flower");
            System.out.println("2. Customer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sca.nextInt();
            sca.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nFlower details:");
                    System.out.println("Enter flower name :");
                    fname = sca.next();
                    System.out.println("Enter number of petals : ");
                    f_petals = sca.nextInt();
                    System.out.println("Enter number of pieces: ");
                    f_pieces = sca.nextInt();
                    System.out.println("Enter Price: ");
                    f_price = sca.nextFloat();
                    
                    Flower1 f = new Flower1(fname, f_pieces, f_petals, f_price);
                    f.calculateDiscount();
                    f.display();
                    break;
                case 2:
                	Customer1 c = new Customer1();
                    System.out.println("\nCustomer details:");
                    c.getData();
                    c.display();
                    break;
                case 0:
                    System.out.println("\nExiting program...");
                    break;
                default:
                    System.out.println("\nInvalid choice!");
            }
        } while (choice != 0);
		

	}

}
