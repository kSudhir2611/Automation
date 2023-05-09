package day1;

public class ShopclueAddToCart 
{
 
  public static void main(String[] args) 
  {
	int[] arr = {23,5,45,6,6,7,8,9,9900};
	
	int large1,large2,temp;
	large1 = arr[0];
	large2 = arr[1];
	
	if(large1 < large2) 
	{
		temp = large1;
		large1 = large2;
		large2 = temp;
		
	}
	for(int i=0; i <arr.length; i++) 
	{
		if(arr[i]>large1) 
		{
			large2=large1;
			large1 = arr[i];
		}
		else if(arr[i]>large2 && arr[i]!=large1)
		{
			large2=arr[i];
		} 
	}
	System.out.println("large1: "+large1);
	System.out.println("large2: "+large2);
			
}
}
	
	
  
 

