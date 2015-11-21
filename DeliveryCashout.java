/* #############################################################################
	Class DeliveryCashout - Reads a text file of the orders delivered that shift
		and determines how much the driver owes the restaurant and how much they
		made in tips.
	
	getOrder(String orderData) - gets an order from a line of information in the
		text file

	@author Brian McEntee
	@version 1.0
############################################################################# */

public class DeliveryCashout {
	static final int ORDERNUM_INDEX = 0;
	static final int PRICE_INDEX = 1;
	static final int TOTAL_INDEX = 2;

	public static void main(String[] args) {

	}

	public static BillableOrder getOrder(String delivery) {
		BillableOrder order;
		String[] delivData = delivery.split("\t");
		if(delivData.[PRICE_INDEX].toLowerCase() == "cc") {
			double price = 0.00;
			
		}
		else {
			//delivery is cash
		}
		return 
	}
}