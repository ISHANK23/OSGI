package icecreampublisher;

import java.util.HashMap;
import java.util.Scanner;
import com.res.Strings;

public class IceCreamPublisherImpl implements IceCreamPublisher {
	

	@Override
	public IceCream menu() {
		
		Strings STR = new Strings();
		String optional= "NO";
		String buyReply;
		
		HashMap<Integer, Integer> flavours = new HashMap<Integer, Integer>(); //Ice cream Flavours
		
		flavours.put(1,0);
		flavours.put(2,0);
		flavours.put(3,0);
		flavours.put(4,0);
		flavours.put(5,0);
		flavours.put(6,0);
		flavours.put(7,0);
		
		double amount = 0;
		int count = 1;
		int type;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(STR.LABEL); //Display menu
		System.out.println();
		System.out.println(STR.ICECREAM_MENU);
		
		System.out.println(STR.LABEL); //Display label
		System.out.println();
		
		do {
			do {
				System.out.print(STR.SELECT_ICECREAM_FLAVOUR);  //Customer needs to select
				type = scanner.nextInt();
				amount = Calculations.typeselect(type);
			}while(amount == 0);		
			
			System.out.print(STR.NO_OF_ICECREAM);
			count = scanner.nextInt();
			System.out.println();
			
			flavours.put(type,count);
			

			
			System.out.print(STR.OPTIONAL);
			optional = scanner.next().toString();
			System.out.println();
			
		}while(!optional.equalsIgnoreCase("NO"));
		
		          System.out.print(STR.BUY_REPLY);
		          buyReply = scanner.next().toString();
		

		IceCream iceCream = new IceCream(buyReply, flavours);
		return iceCream;
	}

}
