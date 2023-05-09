package helper;

public class OnlyJavaPractice {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,3};
		int n = arr.length;
		int a =findSumWithThreeIndex(arr,n);
		
			System.out.print(a+" ");
		

	}
	public static int findSumWithThreeIndex(int[] arr,int n) 
	{  
		int count=0;
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]==arr[j])
					count++;
			}
		}
		return count;
	}
	
}
