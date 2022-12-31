package compare_sort;

import java.util.*;

class BuyGifts {
	
	// make class into an object to store gift info
	String name;
	Integer price;
	Integer qty;

	BuyGifts(String name, Integer price, Integer qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int noOfChildren = sc.nextInt();
		int noOfChildren = 5;
		// String noOfChildren = 5 sc.next();
		String giftStockAvailibility = "Chocolate:30:2,IceCream:15:8"; // 75
		
		/* noOfChildren = 5
		 * String giftStockAvailibility = "Chocolate:30:2,IceCream:15:8"; // 75
		 * String giftStockAvailibility = "Chocolate:30:2,IceCream:15:2"; // 0
		 * String giftStockAvailibility = "Chocolate:30:9,IceCream:15:5"; // 150
		 * String giftStockAvailibility = "Chocolate:30:3,IceCream:15:2"; // 0
		 * 
		 * */
		
		// Write your logic here
		
		// split string in an array
		String[] giftsArray = giftStockAvailibility.split(",");
		System.out.println(Arrays.toString(giftsArray));
		
		// make empty list to store all the gift object
		List<BuyGifts> giftList = new ArrayList<>();

		// over the array and instantiate a gift object and add it to list
		for (String s : giftsArray) {
			String[] gift = s.split(":");
			BuyGifts g = new BuyGifts(gift[0], Integer.parseInt(gift[1]), Integer.parseInt(gift[2]));
			giftList.add(g);
		}
		
		
		// get gift with highest price. if not enough quantity continue to next gift
		//if neither have enough quantity neither will be chosen
		int highest = 0;
		BuyGifts expGift = null;
		for (BuyGifts g : giftList) {
			if(g.qty<noOfChildren)
				continue;
			if (g.price > highest) {
				highest += g.price;
				expGift = g;
			}
		}
		
		// if a gift met the required criteria then determine how much is required to buy one gift for each child
		if(expGift!=null) {
			int totalCost = noOfChildren*expGift.price;
			System.out.println(totalCost);
		} else {
			int totalCost = 0;
			System.out.println(totalCost);
		}
		
		sc.close();
	}

}