package practice;
import java.util.Date;

public class DisplayDate {
   @SuppressWarnings("deprecation")
public static void main(String args[]) {
       // Instantiate an object
       Date date = new Date();
        
       // display current timestamp
       System.out.println(date.getTime());
       System.out.println(date.toInstant());
       System.out.println(date.toGMTString());
       System.out.println(date.toLocaleString());
   }
}