package practice;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		s.add("abcd");
		s.add("efgh");
		s.add("ijkl");
		s.add("mnop");
		s.add("qrstu");
		
		for(int i=0; i<s.size() ; i++){
			
			if(s.get(i).equalsIgnoreCase("mnop")){
				s.remove(i);
				System.out.println(s.size());
			}
		}
	}

}
