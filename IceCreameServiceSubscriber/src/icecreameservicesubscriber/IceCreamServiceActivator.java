package icecreameservicesubscriber;




import java.util.Scanner;

import icecreampublisher.IceCream;
import icecreampublisher.IceCreamPublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import billpublisher.BillServicePublisher;
import cartpublisher.CartServicePublisher;



public class IceCreamServiceActivator implements BundleActivator {

	ServiceReference sR1;  //Assign Service Reference Variables
	ServiceReference sR2;
	ServiceReference sR3;
	Scanner scanner = new Scanner(System.in);
	public void start(BundleContext context) throws Exception {


		sR1 = context.getServiceReference(IceCreamPublisher.class.getName());
		IceCreamPublisher icePublish = (IceCreamPublisher) context.getService(sR1);
		String yn = "NO";
		
		while("NO".equalsIgnoreCase(yn)) {
			IceCream iceCream = icePublish.menu();
			
			if("YES".equalsIgnoreCase(iceCream.getBuyReply())) {  //Updating cart for customer's choice 
				
				sR2 = context.getServiceReference(CartServicePublisher.class.getName());
				CartServicePublisher cartPublish = (CartServicePublisher) context.getService(sR2);
				
				
				cartPublish.cart(iceCream.getItems());
				
				
				sR3 = context.getServiceReference(BillServicePublisher.class.getName());
				BillServicePublisher billPublish = (BillServicePublisher) context.getService(sR3);
				
				boolean isTrue = billPublish.billingMethod();
				if(isTrue) {
					System.out.println("Payment Successfull!!!!!"); //If the payment process successful  System will display this message
				}
				
			}else {
				
				System.out.println(" -> !!SOMETHING WENT WRONG!!"); //If the payment process unsuccessful  System will display this message
				System.out.println(" ");
			}
			
			System.out.print(" ** If you want you can exit the program. Are you sure? (YES/NO) :"); //System's ask if program need to close or not
			
			yn =  scanner.next().toString();
			
			if(yn.equalsIgnoreCase("YES")) {
				
				System.out.println(" ** Pleasure doing bussiness with you. Visit us soon!"); //Finally, After successful process system will display this message
				break;
			}		
		
		}

	

	}

	public void stop(BundleContext context) throws Exception {



		context.ungetService(sR1);
	}

}
