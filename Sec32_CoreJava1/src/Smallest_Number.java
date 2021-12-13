
public class Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,5,3,6},{5,9,3,9},{1,8,0,6}};
		int min=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
		}
		System.out.print(min);
	}

}
