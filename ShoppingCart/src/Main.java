import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String item;
		double price;
		int quantity;
		char currency = '$';
		double total;
		
		System.out.print("What item would you like to buy?");
		item = scanner.nextLine();
		System.out.print("What is the price of the item?");
		price = scanner.nextDouble();
		System.out.print("How many items would you like to buy?");
		quantity = scanner.nextInt();
		total = price * quantity;
		
		
		System.out.println("You have bought " + quantity + " of " + item + " for " + price+ ". "+ "Your total is " + total + currency);
		
		
		scanner.close();
	}
}