package cartpublisher;
import java.util.HashMap;

import com.res2.Strings;

public class CartServicePublisherImpl implements CartServicePublisher{
	
	Strings str = new Strings();
	
	
	public void cart(HashMap<Integer, Integer> items){  
		double tPrice = 0.0;
		
		System.out.println();
		System.out.println(str.LABEL);  //Display the bill
		System.out.println("\n");
		
	    for(int x = 1; x <= items.size(); x++){ // Bill Calculation
	    	
	      if(items.get(x) > 0){
	    	  tPrice = tPrice +  (items.get(x) * this.typeselect1(x));
	    	  
	        System.out.println(" X " + items.get(x));
	        
	      }
	      
	    }
	    
	    System.out.println("\n"+str.SPACE+"Total Price\t\t : " + tPrice+"\n\n"); // Display the total price
	    System.out.println(str.LABEL);
	    System.out.println();
	   
	}

	@Override
	public double typeselect1(int choice) {
		double amount = 0; 
		
		HashMap<Integer ,Double> prices = new HashMap<Integer, Double>(); 
		prices.put(1, 80.00);
		prices.put(2, 100.00);
		prices.put(3, 100.00);
		prices.put(4, 120.00);
		prices.put(5, 150.00);
		prices.put(6, 120.00);
		prices.put(7, 180.00);

		
			switch (choice) {              // Prices for bill
	
			case 1:
				amount = (Double)prices.get(1);
				System.out.print(str.SPACE+ "Vanilla Ice Cream\t\t : "+ prices.get(1));
				break;
	
			case 2:
				amount = (Double)prices.get(2);
				System.out.print(str.SPACE+ "Chocolate Price\t\t : "+ prices.get(2));
				break;
	
			case 3:
				amount = (Double)prices.get(3);
				System.out.print(str.SPACE+ "Strawberry Price\t\t : "+ prices.get(3));
				break;
	
			case 4:
				amount = (Double)prices.get(4);
				System.out.print(str.SPACE+ "Orange Price\t\t : "+ prices.get(4));
				break;
			case 5:
				amount = (Double)prices.get(5);
				System.out.print(str.SPACE+ "FruitnNut Price\t\t : "+ prices.get(5));
				break;
	
			case 6:
				amount = (Double)prices.get(6);
				System.out.print(str.SPACE+ "Pineapple Price\t\t : "+ prices.get(6));
				break;
				
			case 7:
				amount = (Double)prices.get(7);
				System.out.print(str.SPACE+ "Kithul-Pani Price\t\t : "+ prices.get(7));
				break;
	
			default:
				break;
			}
		
		return amount;
	}
}
