package practice;

import java.util.ArrayList;
import java.util.List;

public class StringSearch {
	
	public void Search(){
		String s = "17080203149";
		List<String> orderlist = new ArrayList<String>();
		orderlist.add("17080203149|001|trustpay|1481015042583");
		orderlist.add("17080203150|001|trustpay|1481015042583");
		orderlist.add("17080203153|001|trustpay|1481015042583");
		orderlist.add("17080203175|001|trustpay|1481015042583");
		orderlist.add("17080203159|001|trustpay|1481015042583");
		
		System.out.println(orderlist.get(1).length());
		System.out.println(orderlist.get(1).substring(0,11));
		System.out.println(orderlist.get(1));
		System.out.println(orderlist.get(0).regionMatches(1, orderlist.get(0).substring(0,11), 0, 11));
		
		
		for(int i = 0; i <orderlist.size(); i++){
			if(orderlist.get(i).regionMatches(0,orderlist.get(i).substring(0,11), 38, 38)){
				System.out.println("Found");
			}	
		}
	}

	public static void main(String[] args) {
		
		StringSearch s = new StringSearch();
		s.Search();
	}

}
