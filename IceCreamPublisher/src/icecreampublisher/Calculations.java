package icecreampublisher;

import java.util.HashMap;

public class Calculations {

	public static double typeselect(int choice) {
		
		double amount = 0; 
		
		HashMap<Integer ,Double> price = new HashMap<Integer, Double>(); //Assign prices for ice creams
		price.put(1, 80.00);
		price.put(2, 100.00);
		price.put(3, 100.00);
		price.put(4, 120.00);
		price.put(5, 150.00);
		price.put(6, 120.00);
		price.put(7, 180.00);

		
			switch (choice) { //Display the prices of customer's selected
	
			case 1:
				amount = amount + (Double)price.get(1);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(1)+"\n");
				break;
	
			case 2:
				amount = amount + (Double)price.get(2);
				System.out.println(" ->   Your selected ice cream flavour's price : "+ price.get(2)+"\n");
				break;
	
			case 3:
				amount = amount + (Double)price.get(3);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(3)+"\n");
				break;
	
			case 4:
				amount = amount + (Double)price.get(4);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(4)+"\n");
				break;
			case 5:
				amount = amount + (Double)price.get(5);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(5)+"\n");
				break;
	
			case 6:
				amount = amount + (Double)price.get(6);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(6)+"\n");
				break;
				
			case 7:
				amount = amount + (Double)price.get(7);
				System.out.println(" ->   Your selected ice cream flavour's price  : "+ price.get(7)+"\n");
				break;
	
			default:
				System.out.print(" **You have entered an invalid number! Please check the number and try again, Thank you...: "); //Customer enter's invalid number in menu list
				break;
			}
		
		return amount;
	}
	

	
	
}
