//This code has been written by Surajit Das. Contact me @ smartsurajit2008@gmail.com for any corrections.
//Feel free to modify the code and reuse it based on your need.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int [] a = {0,1,2,4,6};
		int [] b = {1,3,5,7,8};
		int [] t = new int[10];
		merge(a,b,t);*/
		
		int [] s = {2,4,1,6,8,5,3,7};
		
		mergesort(s);
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+ " ");
	}

public static void merge(int []left,int[] right,int []temp)
{
	
	int i = 0,j = 0,k = 0;
	int l = left.length;
	int m = right.length;
	
	
	for(k=0;k<temp.length;k++)
	{
		if(left[i]<right[j])
		{
			temp[k] = left[i];
			i = i +1;
			
		}
		
		else{
			temp[k] = right[j];
			j = j +1;
			
		}
		
		if(i==l)
		{
			for(int p = j;p<m;p++)
			{
				k++;
				temp[k] = right[p];
			}
		}
		
		if(j==m)
		{
			for(int q = i;q<l;q++)
			{
				k++;
				temp[k] = left[q];
			}
		}
	}
	
	
}

public static void mergesort(int[]a)
{
	int n= a.length;
	if(n<2) return;
	int mid = n/2;
	int [] left = new int [mid];
	int [] right = new int[n-mid];
	
	for(int i=0;i<mid;i++)
	{
		left[i] = a[i];
	}
	
	for(int i =mid;i<n;i++)
	{
		right[i-mid] = a[i];
	}
	
	
	mergesort(left);
	mergesort(right);
	merge(left,right,a);
	
	
	
}



}
