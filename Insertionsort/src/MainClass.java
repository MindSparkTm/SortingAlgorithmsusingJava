//This code has been written by Surajit Das. Contact me @ smartsurajit2008@gmail.com for any corrections.
//Feel free to modify the code and reuse it based on your need.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] m = {0,5,4,6,1,3};
		insertionsort(m);
		display(m);
 	}

	public static void insertionsort(int [] a)
	{
		int i;
		int key;
		for (int j=1;j<a.length;j++)
		{
			key = a[j];
			i = j -1;
			
			
			while(i>=0 & a[i]>key)
			{
				a[i+1] = a[i];
				
				if(i>0)
				{
				a[i] = key;
				i = i -1;
				
				
				}

				else
				{
					a[i] = key;
				}

				
  
				
			}
			
			
			
			
			
		}
		
		
		
	}
	
	
	public static void display(int [] a)
	{
		for(int i =0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
