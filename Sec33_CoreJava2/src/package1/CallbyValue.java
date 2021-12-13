package package1;

public class CallbyValue {
	int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable  
	 }  

	 void change(CallbyValue op){  
		 op.data=op.data+100;//changes will be in the instance variable  
		 }  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallbyValue c=new CallbyValue();
		System.out.println(c.data);
		c.change(100);
		System.out.println(c.data);
		
		System.out.println(c.data);
		c.change(c);
		System.out.println(c.data);
	}

}
