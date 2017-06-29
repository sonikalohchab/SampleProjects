package com.prep.Vending;

import java.util.List;

/*You need to design a Vending Machine which
 Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
 Allow user to select products Coke(25), Pepsi(35), Soda(45)
 Allow user to take refund by canceling the request.
 Return selected product and remaining change if any
 Allow reset operation for vending machine supplier.
*/

public interface VendingMachine {
	public long selectItemAndGetPrice(Item item); 
	public void insertCoin(Coin coin); 
	public List<Coin> refund() throws NotSufficientChangeException; 
	public Bucket<Item, List<Coin>> collectItemAndChange() throws NotSufficientChangeException, NotFullPaidException; 
	public void reset();	
	

	
}
