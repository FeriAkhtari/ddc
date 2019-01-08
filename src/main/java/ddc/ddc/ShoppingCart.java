package ddc.ddc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<String> items;

	public ShoppingCart() {
		if (items == null) {
			items = new ArrayList<String>();
		}
	}

	public void addItem(String item) {
		items.add(item);
	}
	
	public Boolean doesContain(String item) {
		return items.contains(item);
	}

	public Double checkOut() {
		double total = 0;
		if (items == null) {
			return total;
		}
		for (String item : items) {
			if (item.equals("Apple")) {
				total += 0.65;
			} else if (items.equals("Orange")) {
				total += 0.25;
			}
		}

		return total;
	}

	public double checkOutwithOffer() {
		double total = 0;
		double appleCount = 0;
		double orangeCount = 0;
		double whole = 0;
		double rem = 0;

		if (items == null) {
			return total;
		}

		for (String item : items) {
			if (item.equals("Apple")) {
				appleCount += 1;
			} else if (item.equals("Orange)")) {
				orangeCount += 1;
			}
		}
		whole = appleCount / 2;
		rem = appleCount % 2;
		total = (whole * 0.65) + (rem * 0.65);
		whole = orangeCount / 3;
		rem = orangeCount % 3;
		total += (whole * 2 * 0.25) + (rem * 0.25);
		
		return total;
	}
}
