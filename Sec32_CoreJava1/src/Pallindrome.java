
public class Pallindrome {

	
	public static void main(String[] args) {
		
		String s="ashwin";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.print(t);
		
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
		
	}
}
