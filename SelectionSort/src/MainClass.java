
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] m = {2,5,1,9,1,3};
		selectionsort(m);
		display(m);

	}
	
	public static void selectionsort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int smallest = a[i];
			int temp = smallest;
			int k=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<smallest)
				{
					smallest = a[j];
					k = j;
					
				}
			}
			
			if(temp!=smallest)
			{
			int key = a[i];
			a[i] = smallest;
			a[k] = key;
			}
			
		}
		
		
	}

	public static void display(int []a){
		for (int i =0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}
