package billpublisher;
import java.util.Scanner;

import com.res1.Strings;

public class BillServicePublisherImpl implements BillServicePublisher {
	
	Strings Str = new Strings();
	

	@Override
	public boolean billingMethod() {
		int method;
		int secCode;
		int cNnumber;
		boolean isValid = false;
	    String exDdate;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(Str.PAYMENT);  // System shows these payment methods
	    System.out.print(Str.PAYMENT_TYPE);
	    method = scanner.nextInt();
	    System.out.println();
	    
	    if(method == 1){ // If customer choose 1st method will move on to the cash payment and program will end
	    	isValid = true;
	      
	      return isValid;
	    }
	    else if(method == 2){ // If customer choose 2nd method, Customer need's to enter the some details
	  
	      while (!isValid) {
	    	  
				System.out.print(Str.CARD_NUMBER);
				cNnumber = scanner.nextInt();
	            System.out.println();

	            System.out.print(Str.EXPIRY_DATE);
	            exDdate = scanner.next();
	            System.out.println();

	            System.out.print(Str.SECURITY_CODE);
	            secCode = scanner.nextInt();
	            System.out.println();
	        
				if ((Integer.toString(cNnumber).length() != 10)) {  // Validation for card number
					
					isValid = false;
					System.out.println(Str.INVALID_NUMBER);
					
					if (Integer.toString(secCode).length() != 3)  // Validation for security code
						System.out.println(Str.INVALID_CVC); 
	               
	                
				} else if (Integer.toString(secCode).length() != 3) {
					
					isValid = false;
					System.out.println(Str.INVALID_CVC); 
	                
				}else{
					isValid = true;
				
					break;
				}
			}
			
	     }
	    
	    return isValid;
	}

}
