package programkey;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		                int a = 40, b = 4, c = 4;
		                int result;
		                try
		                {
		                        result = a / (b-c);
		                }
		                catch (Exception Handling )
		                {
		                        System.out.println("Cannot divided by zero.");
		                }
		                finally
		                {
		                        System.out.println("finally block");
		                }
		                result = a / (b+c);
		                System.out.println("Result: "+result);
		        }
		
	}

