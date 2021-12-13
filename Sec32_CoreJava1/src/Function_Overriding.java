
public class Function_Overriding extends Inhertitance_1 {

	public void Engine()
	{
		System.out.println("New Engine of child");
	}
	
	public void player(int a)
	{
		System.out.print(a*2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function_Overriding f=new Function_Overriding();
		f.Engine();
		f.body();
		f.player(5);
	}
	
	

}
