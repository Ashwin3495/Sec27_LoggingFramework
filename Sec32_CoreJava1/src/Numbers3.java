
public class Numbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=3,l=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+k*l);
				//System.out.print(" "+k*j);  //2nd output
				l++;
			}
			System.out.println();
		}
		
	}

}

/*
3
6 9
12 15 18
21 24 27 30
*/

/* 
 3
 3 6
 3 6 9
 3 6 9 12
 */