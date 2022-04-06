package icecreampublisher;

import java.util.HashMap;

public class IceCream {
	
	String buyReply;
	HashMap<Integer, Integer> items;
	
	
	
	public IceCream(String buyReply, HashMap<Integer, Integer> items) {
		super();
		this.buyReply = buyReply;
		this.items = items;
	}
	public String getBuyReply() {  //Check the customer's choice
		return buyReply;
	}
	public void setBuyReply(String buyReply) {
		this.buyReply = buyReply;
	}
	public HashMap<Integer, Integer> getItems() {
		return items;
	}
	public void setItemst(HashMap<Integer, Integer> items) {
		this.items = items;
	}
	

	

}
