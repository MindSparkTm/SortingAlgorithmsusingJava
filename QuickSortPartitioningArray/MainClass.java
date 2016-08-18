//This code has been written by Surajit Das. Contact me @ smartsurajit2008@gmail.com for any corrections.
//Feel free to modify the code and reuse it based on your need.

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {5,3,7,1,2,9,11,4};
		partition(a,0,7);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + "\t");
		
	}
	
	public static void partition(int []a,int start,int end)
	{
		int Pivot_Element = a[end];
		int Pivot_Index = start;
		
		for(int i=0;i<=end;i++)
		{
			if(a[i]<Pivot_Element)
			{
				int temp =a[i];
				a[i] = a[Pivot_Index];
				a[Pivot_Index] = temp;
				Pivot_Index +=1;
				
			}
		}
		
		int t = a[Pivot_Index];
		a[Pivot_Index] = Pivot_Element;
		a[end] = t;
		
		
	}

}
