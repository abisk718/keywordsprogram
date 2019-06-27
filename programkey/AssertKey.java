package programkey;

import java.util.Scanner;

public class AssertKey {

	
		public static class MainClass
		{
		    public static void main(String[] args) 
		    {
		        System.out.println("Enter your marks");
		         
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
		         
		        int marks = sc.nextInt();
		         
		        assert marks > 35 : "FAIL";
		    }
		

	}

}
