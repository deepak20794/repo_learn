package practice;

import java.util.List;

public class StringTest {


	
	public static void main(String[] args) {
		

		List<String> Date;
	
		String test = "WCS_RegisteredCustomer_CO_Apm_Sofort_Austria_WCC_AddLineError_AT";
		
		System.out.println(test.substring(test.length()-2, test.length()));
		
		
		
		String test1 = "17/DEC/2016";
		//System.out.println(test1.substring(0, 12));
		
		String[] date=test1.split("/");
		
		String price = "EUR 85.54";
		
		
		
		String pricemodified = price.replace(".", "");
		
		pricemodified = pricemodified.replaceAll("EUR ","");
		
	System.out.println(pricemodified);

	}
}


