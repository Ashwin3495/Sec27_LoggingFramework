
public class childDemo extends childlevel{
	

		String name ="QAClickAcademy";


		public childDemo()
		{
		super();// this should be always be at first line
		System.out.println("child class construtor");

		}
		public void getStringdata()
		{
		System.out.println(name);
		//System.out.println(super.name);
		}


		public void getData()
		{
		super.getData(5);
		System.out.println("I am in child class");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();

		cd.getStringdata();
		cd.getData();
		}

		}
