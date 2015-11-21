/*##############################################################################
	Class CreditCardOrder -- a billable order which can credit the driver with a 
							 tip for cashout and does not have to be repayed

	
	@author Brian McEntee
	@version 1.0
##############################################################################*/

public class CreditCardOrder extends BillableOrder {
	private double tip;
	private boolean tipOnCard;
	public CreditCardOrder() {
		super();
		tip = 0;
	}

	public CreditCardOrder(int orderNumber, double price, 
							double tip, boolean tipOnCard) {
		super(orderNumber,price);
		this.tip = tip;
		this.tipOnCard = tipOnCard;
	}

	public double cashOut() {
		if(tipOnCard)
		return (-1 * tip) - getDeliveryCharge();
		else
			return (-1 * getDeliveryCharge());
	}

	public String toString() {
		String str = super.toString() + "\nAmount Made: " 
					 + cash_df.format(cashOut());
		return str;
	}
}