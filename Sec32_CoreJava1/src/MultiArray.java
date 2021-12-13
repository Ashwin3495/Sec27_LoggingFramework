
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,5,3,6},{5,9,3,9}};
		for(int i=0;i<a.length;i++)	//row
		{
			System.out.println("");
			for(int j=0;j<a[i].length;j++)	//column
			{
				System.out.print(" "+a[i][j]);
			}
		}
		
		
	}

}
