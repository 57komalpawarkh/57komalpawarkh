import java.util.*;
class Array1
{
	public static int subArray(int arr[],int n)
	{
	    int left = 0;
		int right = n - 1;
			while(left + 1 < n && arr[left] <= arr[left+1]) 
			{
				left++;
			}
				if(left == n - 1) 
					return 0;
       
			while(right > left && arr[right-1] <= arr[right]) 
			{
				right--;
			}
				if(right==0)
					return n;
			
				int min = (n-left-1) < right? n-left-1: right;
				int i = 0;
				int j = right;
			while(i <= left && j < arr.length)
			{
				if(arr[j] >= arr[i]) {
					min = min < (j-i-1)? min : j-i-1;
					i++;
				}
				else {
					j++;
				}   
			}
        return min;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println("\n"+subArray(arr,n));
	}
}