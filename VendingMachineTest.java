package com.prep.Vending;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

public class VendingMachineTest {

	private static VendingMachine vm;

	@BeforeClass
	public static void setUp() {
		vm = VendingMachineFactory.createVendingMachine();
	}

	@AfterClass
	public static void tearDown() {
		vm = null;
	}

	@Test
	public void testBuyItemWithExactPrice() throws NotSufficientChangeException, NotFullPaidException {
		//select item, price in cents 
		long price = vm.selectItemAndGetPrice(Item.COKE); 
		//price should be Coke's price 
		assertEquals(Item.COKE.getPrice(), price); 
		//25 cents paid 
		vm.insertCoin(Coin.QUARTER); 
		Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange(); 
		Item item = bucket.getFirst(); 
		List<Coin> change = bucket.getSecond(); 
		
		//should be Coke 
		assertEquals(Item.COKE, item); 
		
		//there should not be any change 
		assertTrue(change.isEmpty()); 

		}
	
	@Test 
	public void testBuyItemWithMorePrice() throws NotSufficientChangeException, NotFullPaidException
	{ 
		long price = vm.selectItemAndGetPrice(Item.SODA); 
		assertEquals(Item.SODA.getPrice(), price); 
		vm.insertCoin(Coin.QUARTER); 
		vm.insertCoin(Coin.QUARTER); 
		Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange(); 
		Item item = bucket.getFirst(); 
		
		List<Coin> change = bucket.getSecond(); //should be Coke assertEquals(Item.SODA, item); //there should not be any change assertTrue(!change.isEmpty()); //comparing change assertEquals(50 - Item.SODA.getPrice(), getTotal(change)); } 
	}

	
}
