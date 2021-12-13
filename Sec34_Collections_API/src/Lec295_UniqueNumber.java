import java.util.ArrayList;

public class Lec295_UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,8,8,8,6,6,5,5,4,9};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				//System.out.print(a[i]);
				//System.out.print(k);
			}
			if(k==1)
				System.out.print(a[i]);
		}
		
	}

}
