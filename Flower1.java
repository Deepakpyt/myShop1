package myShop1;

public class Flower1 {
	String name;
	int no_of_petals, no_of_pieces;
	float price, total_price;
	Flower1(){
		name = "Rose";
		no_of_petals = 10;
		price = 20.0f;
		no_of_pieces = 5;
		total_price = no_of_pieces * price;
	}
	Flower1(String f, int p, int np ,float pr){
		name = f;
		no_of_pieces = p;
		no_of_petals = np;
		price = pr;
		total_price = p * price;
	}
	float calculateDiscount() {
		if(total_price > 2000.0f)
			return 200.0f;
		else
			return 100.0f;
		
	}
	void display() {
		System.out.println("Flower name: " + name);
		System.out.println("No. of petals: " + no_of_petals);
		System.out.println("No. of pieces: " + no_of_pieces);
		System.out.println("Price: " + price);
		System.out.println("Total price: "+ total_price);
		System.out.println("Discount given: "+ calculateDiscount());
		System.out.println("Discounted price: "+ (total_price - calculateDiscount()));
	}

}
 
