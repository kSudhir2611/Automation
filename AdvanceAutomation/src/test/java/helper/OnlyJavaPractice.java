package helper;

import java.util.HashMap;
import java.util.Map;

public class OnlyJavaPractice {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,0,8,5,6};
		int n = arr.length;
		int target = 9;
		//int[] a = soterdsquredArray(arr,n);
		//int[] a=arrywithEvenNumberthenodd(arr,n);
		//int[] a = sortArrayWithoutUsingSortFunction(arr,n);
	
		
		int[][] nums= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int l = nums.length;
		//countNumberOfNegativeNumberInSortedArray(nums,l);
		twoSumArray(arr,n,target);
		//int[] ar = incrementByOne(arr);
		
		
			
		

	}
	public static int[] soterdsquredArray(int[] arr,int n) 
	{
		int res[] = new int[n];
		int me=n-1, frnd=0;
		int i = n-1;
		while(me >= frnd) 
		{
			if(Math.abs(arr[me])>=Math.abs(arr[frnd])) 
			{
				res[i]=Math.abs(arr[me]);
				me--;
				i--;
			}else 
			{
				res[i]=Math.abs(arr[frnd]);
				frnd++;
				i--;
			}
		}
			
			for(int j=0;j<n;j++) 
			{
				res[j]=res[j]*res[j];
			}
				
		return res;
	}
	
	public static int[] arrywithEvenNumberthenodd(int arr[],int n) 
	{
		/*int[] res = new int[n];
		int me=n-1,frnd=0;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]%2==1) 
			{
				res[me]=arr[i];
				me--;
			}else 
			{
				res[frnd]=arr[i];
				frnd++;
			}
		}
		return res;*/
		
		int me = 0,temp;
		for(int i =0;i<n;i++) 
		{
			if(arr[i]%2==0) 
			{
				temp=arr[me];
				arr[me]=arr[i];
				arr[i]=temp;
				me++;
			}
		}
		return arr;
	}
	
	public static int[] sortArrayWithoutUsingSortFunction(int[] arr,int n) 
	{
		/*int me=0,temp;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]==0) 
			{
				temp=arr[me];
				arr[me]=arr[i];
				arr[i]=temp;
				me++;
			}
		}
			me=n-1;
			for(int j=n-1;j>=0;j--) 
			{
				if(arr[j]==2) {
				temp=arr[me];
				arr[me]=arr[j];
				arr[j]=temp;
				me--;
				}
			}
		
		return arr;*/
		
		int count0=0,count1=0,count2=0;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]==0)
				count0++;
			else if(arr[i]==1)
				count1++;
			else if(arr[i]==2)
				count2++;
			
		}
			int x=0;
			while(count0!=0) 
			{
				arr[x]=0;
				x++;
				count0--;
			}
			while(count1!=0) 
			{
				arr[x]=1;
				x++;
				count1--;
			}
			while(count2!=0) 
			{
				arr[x]=2;
				x++;
				count2--;
			}
			
			
		return arr;
	}
	
	public static void countNumberOfNegativeNumberInSortedArray(int[][] arr,int n) 
	{
		int count=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(arr[i][j]<0)
					count++;
			}
		}
		System.out.println("count of negative number in array: "+count);
	}
	
	public static void twoSumArray(int[] arr,int n,int target) 
	{	
		int[] result = new int[2];
		/*for(int i=0;i<n;i++) 
		{
			int diff = target-arr[i];
			for(int j=i+1;j<n;j++) 
			{
				if(arr[j]==diff) 
				{
					result[0]=i;
					result[1]=j;
					break;
				}
			}
			
		}*/
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++) 
		{
			if(mp.containsKey(target-arr[i])) 
			{
				
			}
		}
		for(int a:result) 
		{
			System.out.print(a+" ");
		}
	}
	public static int[] incrementByOne(int []digits) 
	{
		int n = digits.length;// 1 2 3
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++; return digits;// 124
	        }
	        digits[i] = 0;// 120
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
	
}
