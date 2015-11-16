/*##############################################################################
	Abstract Class BillableOrder -- an order which can be billed and delivered
	
	@author Brian McEntee
	@version 1.0
##############################################################################*/
import java.text.DecimalFormat;
public abstract class BillableOrder {
	private final int ORDER_NUMBER;
	private final double PRICE;
	private static final double DELIV_CHARGE = 1.00;

	public static DecimalFormat cash_df = new DecimalFormat("$#,##0.00");

	public BillableOrder() {
		//ultimately creates a useless order
		ORDER_NUMBER = -1;
		PRICE = 0.00;
	}

	public BillableOrder(int orderNumber, double price) {
		this.ORDER_NUMBER = orderNumber;
		this.PRICE = price;
	}

	public double getPrice() {
		return PRICE;
	}

	public int getOrderNumber() {
		return ORDER_NUMBER;
	}

	public double getDeliveryCharge() {
		return DELIV_CHARGE;
	}

	// determines the amount the driver is owed or payed for the delivery
	public abstract double cashOut();
	@Override
	public String toString() {
		return "Order Number: " + ORDER_NUMBER + 
			   "\nPrice: " + cash_df.format(PRICE);
	}
}