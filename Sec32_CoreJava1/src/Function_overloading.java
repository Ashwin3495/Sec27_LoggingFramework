
public class Function_overloading {

	public void getData(int a)
	{
		System.out.println(a*5);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_overloading f=new Function_overloading();
		f.getData(5);
		f.getData("Ashwin");
		f.getData(5, 10);
	}

}
