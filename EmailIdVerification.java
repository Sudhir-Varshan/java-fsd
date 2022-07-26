package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailIdVerification {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("abcd.efgh@ijk.com");
        emailID.add("lmnopqr.stu@vwx.com");
        emailID.add("yzabcd.efh@gij.com");
        emailID.add("klmn.opqr@stu.com");
        emailID.add("vwxy.zabcd@efg.com");
   
        
         String searchEmail = null;
         System.out.println("Enter the email to search");
         
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter email Id : ");
          searchEmail = sc.nextLine(); 
		}
             if(emailID.contains(searchEmail)){
          System.out.println("email ID " + searchEmail + " found");
      }
      else{
          System.out.println( "email ID " + searchEmail + " not found");
      }
 
        
    }

}