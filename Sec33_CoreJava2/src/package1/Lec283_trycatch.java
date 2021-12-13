package package1;

public class Lec283_trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//int i=10;
			int i=0;
			int j=5;
			int k=j/i;
			
			
			System.out.println(k);
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("Calculation error");
		}	
		catch(IndexOutOfBoundsException r)
		{
			System.out.println("Out Exception");
	
		}
		catch(Exception e)	//This default exception should be the last one
		{
			System.out.println("Arthemetic Exception");
		}
		finally		//Will run irrespective of any success or exception
		{
			System.out.println("This is final execution block");
		}
	}

}
