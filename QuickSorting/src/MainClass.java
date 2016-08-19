//This program has been written by Surajit Das. Feel free to correct any error or modify the code for the purpose of reuse
//Contact him @ smartsurajit2008@gmail.com for your mean comments lol :)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] a = {5,3,7,1,2,9,11,4};//test case 1
		//int [] a = {7,6,5,4,3,2,1,0}; // test case 2
		//int[]a = {1,2,3,4,5,6,7,0};//test case 3
		int [] a = {2,-1,7,0,1,0,11,3};//test case 4
		Quicksort(a,0,7);
		for(int i=0;i<8;i++)
		{
			System.out.print(a[i] + "\t");
			
		}

	}
	
	public static int partition(int []a,int start,int end)
	{
		int Pivot_Element = a[end];
		int Pivot_Index = start;
		
		for(int i=start;i<end;i++)
		{
			if(a[i]<=Pivot_Element)
			{
				
				swap(i,Pivot_Index,a);
				
				Pivot_Index+=1;
				
				
				
			}
		}
		
		swap(Pivot_Index,end,a);
		
		
		return Pivot_Index;
		
		
	}
	
	
	public static void Quicksort(int [] a, int start,int end)
	{
		if(start<end)
		{
			int pindex = partition(a,start,end);
			Quicksort(a,start,pindex-1);
			Quicksort(a,pindex+1,end);
		}
	}

  public static void swap(int i, int j,int[] a)
  {
	  int temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;
  }
}
