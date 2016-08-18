
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] s = {3,41,52,26,38,57,9,49};
		
		Bubblesort(s);
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+ " ");
	}
	
	
	public static void Bubblesort(int[]a)
	{
		int n = a.length;
		int flag = 0;

		for(int k=0;k<a.length;k++)
		{
			int s = n-2;
			for(int i=0;i<=s-k;i++) //this is a improvement of the bubble sort by reducing the loop maximum everytime by k
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flag = flag + 1;
					
					
				}
				
				
				
			}
			if(flag==0) //this is the best part. If flag is 0 after a swap that means that the array is already sorted, so
				        //terminate the loop immediately. This will save us time.
				break;

			flag = 0;
		}
		
			}


	
}
