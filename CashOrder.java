/*##############################################################################
	Class CashOrder -- A BillableOrder that was paid for in cash and thus is 
					   money the driver is resposible to repay upon cashout

	@author Brian McEntee
	@version 1.0
##############################################################################*/

public class CashOrder extends BillableOrder {
	private double totalCashPaid;
	public CashOrder(int orderNumber, double price, double totalCashPaid) {
		super(orderNumber,price);
		this.totalCashPaid = totalCashPaid;
	}

	public	 CashOrder() {
		super();
	}
	public double cashOut() {
		return getPrice() - getDeliveryCharge();
	}

	public double getTip() {
		return totalCashPaid - getPrice();
	}

	public String toString() {
		String str = super.toString() + 
			"\nAmount Owed: " + cash_df.format(cashOut()) + 
			"\nTip Received: " + cash_df.format(getTip());
		return str;
	}
	
}