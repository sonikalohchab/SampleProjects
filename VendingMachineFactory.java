package com.prep.Vending;

public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() 
	{ 
		return new VendingMachineImpl(); 
	}


}
