
public class Lec267 {

	/*2 4 5

	3 4 7

	1 2 9*/
	
	//Find max no from column which has minimum value 
	//Find the min number in array
	//Find the column number
	//Find max value in that column
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,5},{3,0,7},{1,10,9}};
		int min=a[0][0];
		int mincolumn = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincolumn=j;
				}
			}
		}
		
		int max=a[0][mincolumn];
		
		for(int k=0;k<3;k++)
		{
			if(a[k][mincolumn]>max)
			{
				max=a[k][mincolumn];
			}
		}
		System.out.println("Max:"+max);
		
		
		System.out.println("Min:"+min);
		System.out.println("Value with min col:"+mincolumn);
	}

}
