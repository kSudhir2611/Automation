package BasicJavaProgram;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class JavaPrograms {
	static int fact = 1;
	static int a=0,b=1,c;
	public static void main(String[] args) {
		
		//swapingTwoNumberWithThirdVariable(3,5);
		//swapingTwoVariableWithoutUsingThirdVariable(5,9);
		//factorial(5);
		//System.out.println(factorialUsingRecursion(10));
		//printFibonacchiSeries(0,1,10);
		//System.out.print(a+" "+b+" ");
		//printFibonacchiusingRecursion(10);
		//reverseNumber(789654);
		//System.out.println("is Number Palindrom: "+isNumberPalindrom(125));/
		//reverseTheString("Sudhir");
		//armstrongNumber(1331);
		//rowByColumnPattern(5,5);
		//rightAngleTrianglePattern(5);
		//invertedRightAnglePattern(5);
		//trianglePattern(5);
		//onlyBoundryPattern(5);
		//FindTwolargestNumber(new int[] {3,5,6,33,12});
		//patternnew(5);
		//findNumberofUCandLCcount("MaHaRaShtra");
		//removeDuplicatesFromString("aabbhhhhhhhhhhhhhhhhhhhhhhhhhhccdd");
		//rotateRightLeftString("Sudhir",2);
		//sortArray(new int[] {6,4,3,7,8,9,2,1});
		//removeDuplicatesFromArray(new int[] {1,1,2,2,2,3,4,5,5});
		//sortTheString("geeksforgeeks");
		//System.out.println(greatestCoomomDivisor(4,20));
		//findnumberofZeroinNfactorial(50);
		//System.out.println("Array Palindrome: "+arrayPalindrome(new int[] {1,2,3,4,3,2,1}));
		//printSumOfElementInArray(new int[] {1,3,4,5,6,7,8,9,10});
		/*String[] arr = {"geeksfor","geekso","geemsi","gee"};
		String result = longestCommomPrefix(arr);
		System.out.println(result);*/
		
		/*int result=romanToInteger("MCMIV");
		System.out.println(result);*/
		
		/*String[] S
        = { "the", "quick", "brown", "fox", "quick" };
		String s1="the";String s2="for";
		int dis=shortestDistanceInString(S,s1,s2);
		System.out.println(dis);*/
		
		printSumOfArrayWithindex(new int[] {1,2,3,4,5,6,7,8});
		
	}
	public static void swapingTwoNumberWithThirdVariable(int a, int b) 
	{
		int temp;
		System.out.println("Number before Swaping:- a="+a+" b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after Swaping:- a="+a+" b="+b);	
	}
	
	public static void swapingTwoVariableWithoutUsingThirdVariable(int a, int b) 
	{
		System.out.println("Number before Swaping:- a="+a+" b="+b);
		a=a*b;//45
		b=a/b;
		a=a/b;
		System.out.println("Number after Swaping:- a="+a+" b="+b);
	}
	
	public static void factorial(int a) 
	{
		
		int fact = 1;
		for(int i=1;i<=a;i++) 
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static int factorialUsingRecursion(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		fact = fact * n;
		factorialUsingRecursion(n-1);
		return fact;
	}
	
	public static void printFibonacchiSeries(int a,int b,int n) 
	{
		System.out.print(a+" "+b+" ");
		int sum = 0;
		for(int i=0;i<n;i++) 
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}
	
	public static void printFibonacchiusingRecursion(int n) 
	{
		if(n>=1) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			printFibonacchiusingRecursion(n-1);
		}
		
	}
	
	public static void reverseNumber(int n) 
	{
		int rem,rev=0;
		System.out.println("Given number: "+n);
		while(n!=0) 
		{
			rem=n%10;
			rev = rev *10 + rem;
			n = n /10;
		}
		System.out.println("reverse Number: "+rev);
	}
	
	public static boolean isNumberPalindrom(int num) 
	{
		int rem,rev=0;
		int p = num;
		while(num!=0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num = num /10;
		}
		if(rev==p) 
		{
			return true;
		}else
			return false;
	}
	
	public static void reverseTheString(String s) 
	{
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("reversed String: "+rev);
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	public static void armstrongNumber(int n) 
	{
		int num = n;
		int arm=0,rem;
		while(n!=0) 
		{
			rem = n%10;
			arm = arm + (rem*rem*rem);
			n = n/10;
		}
		if(arm==num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not armstrong");
	}
	
	public static void rowByColumnPattern(int m,int n) 
	{
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightAngleTrianglePattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedRightAnglePattern(int n) 
	{
		for(int i=n;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)              // i=1 ----*
			{									//i=2 ---**
				System.out.print(" ");
			}
			for(int j =1 ;j<=i;j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void onlyBoundryPattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i==1||j==1||i==n|| j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void FindTwolargestNumber(int[] arr) 
	{
		int large,secondlarge;
		large=secondlarge=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>large) 
			{
				secondlarge=large;
				large=arr[i];
			}
			else if(arr[i]>secondlarge && arr[i]!=large)
				secondlarge=arr[i];	
		}
		System.out.println("largest: "+large);
		System.out.println("Secondlargest: "+secondlarge);
	}
	
	public static void patternnew(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void findNumberofUCandLCcount(String s) 
	{
		int uppercase=0,lowercase=0;
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				uppercase++;
			else
				lowercase++;
		}
		
		System.out.println("Uppercase letter in "+s+" is "+uppercase+" and lowercase letter "+lowercase);
	}
	

	public static void removeDuplicatesFromString(String s) 
	{
		String str = new String();
		for(int i=0;i<s.length();i++) //aabbccdd
		{
			char c = s.charAt(i);
			if(str.indexOf(c)<0) 
			{
				str += c;
			}
		}
		System.out.println(str);
	}
	
	public static void rotateRightLeftString(String s,int d) 
	{
		String str = s.substring(d)+s.substring(0, d);
		System.out.println("rotate left :"+str);
		
		String str1 = s.substring(s.length()-d)+s.substring(0,s.length()-d);
		System.out.println("right rotate :"+str1);
	}
	
	public static void sortArray(int[] arr) 
	{
		int temp;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) //for descending condition is reversed
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void removeDuplicatesFromArray(int[] arr) 
	{
		
	}
	
	public static void sortTheString(String str) 
	{
		char[] arr = str.toCharArray();
		char temp;
		int i=0;
		while(i<arr.length) 
		{
			int j=i+1;
			while(j<arr.length) 
			{
				if(arr[j]<arr[i]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(arr);
	}
	
	public static int greatestCoomomDivisor(int a,int b) 
	{
		if(b==0)
			return a;
		while(a!=0 && b!=0) 
		{
			if(a>b)
				return a=a%b;
			else
				return b=b%a;
		}
		return b;
	}
	
	public static void findnumberofZeroinNfactorial(int n)
	{
		int count = 0;
		for(int i=5;(n/i)>=1;i=i*5) 
		{
			if(i%5==0) 
			{
				count=count+(n/i);
			}
		}
		System.out.println("Number of zero in n!: "+count);
	} 
	
	public static boolean arrayPalindrome(int[] arr) 
	{
		int n = arr.length;
		int me = 0,frnd=n-1;
		
		while(me<=frnd)
		{
			if(arr[me]!=arr[frnd]) 
			{
				return false;
			}
			else
			{
				me++;
				frnd--;
			}
			
		}
		return true;
	}
	
	public static void printSumOfElementInArray(int[] arr) 
	{
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) 
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of given Array: "+sum);
	}
	
	public static String longestCommomPrefix(String[] arr) 
	{
		int n = arr.length;
		
		String result = arr[0];
		
		for(int i=0;i<n;i++) //{"geeksfor","geekso","geemsi","gee"};
		{
			System.out.println(arr[i].indexOf(result));
			while(arr[i].indexOf(result) != 0) 
			{
				result = result.substring(0, result.length()-1);
				
				if(result.isEmpty())
					return "-1";
			}
		}
		return result;
	}
	
	public static int value(char r) 
	{
		if(r=='I')
			return 1;
		if(r=='V')
			return 5;
		if(r=='X')
			return 10;
		if(r=='L')
			return 50;
		if(r=='C')
			return 100;
		if(r=='D')
			return 500;
		if(r=='M')
			return 1000;
		return -1;
	}
	public static int romanToInteger(String str) 
	{
		int res = 0;
		
		for(int i=0;i<str.length();i++) //MCMIV
		{
			int s1 = value(str.charAt(i));//1
			
			if(i+1 < str.length()) 
			{
				int s2 = value(str.charAt(i+1));//5
				
				if(s1>=s2) 
				{
					res = res + s1;//900+1000=1900
				}
				else 
				{
					res = res + s2 - s1;//1900+5-1=1904
					i++;
				}
			}
			else 
			{
				res = res + s1;
			}
		}
		return res;
	}
	
	public static int shortestDistanceInString(String[] arr,String word1,String word2) 
	{
		int ans = Integer.MAX_VALUE;
		int d1=-1,d2=-1;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==word1)
				d1=i;
			if(arr[i]==word2)
				d2=i;
			if(d1!=-1 && d2!=-1)
				ans = Math.min(ans, Math.abs(d1-d2));
		}
		return ans;
	}
	
	public static void printSumOfArrayWithindex(int[] arr) 
	{
		int[] brr = new int[arr.length];
		 brr[0]=arr[0];
		 for(int i=1;i<arr.length;i++) 
		 {
			 brr[i]=brr[i-1]+arr[i];
		 }
		 for(int i=0;i<arr.length;i++) 
		 {
			 System.out.print(brr[i]+" ");
		 }
	}
}

	
