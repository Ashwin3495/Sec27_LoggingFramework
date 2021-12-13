
public class Lec273_super extends Lec270_Constructor {

	String name="Ashwin Devops";
	
	public Lec273_super() 
	{
		super();	//Parent constructor should always be first
		System.out.println("Child class");
		
	}
	
	public void getString()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void getData()
	{
		super.getdata();
		System.out.println("GetData");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lec273_super c=new Lec273_super();
		c.getString();
		c.getData();
	}

}
