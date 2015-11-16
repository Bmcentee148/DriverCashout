/*##############################################################################
	Class CashOrder -- A BillableOrder that was paid for in cash and thus is 
					   money the driver is resposible to repay upon cashout

	@author Brian McEntee
	@version 1.0
##############################################################################*/

public class CashOrder extends BillableOrder {

	public CashOrder(int orderNumber, double price) {
		super(orderNumber,price);
	}

	public	 CashOrder() {
		super();
	}
	public double cashOut() {
		return getPrice() - getDeliveryCharge();
	}

	public String toString() {
		String str = super.toString() + 
			"\nAmount Owed" + cash_df.format(cashOut());
		return str;
	}
	
}