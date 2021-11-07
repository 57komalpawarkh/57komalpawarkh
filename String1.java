import java.util.*;
  
public class String1 {
	
  
  public static String con(String s,int n)
  {
    int length=s.length();   //taking length of string
		if( n > length || n<=1 )  //if we eant only one roq output then return original string
			{
				return s;
			}		
		char[] newString=new char[length];  //creat one char array for output string
		int count=0;  //count for output array index
		int line=2*n-2;  //for n=3 : we get 4 //one variable for intervals   
			for(int i=0;i<n;i++) //i=0 //for loop for no of lines
			{
				int a=line-(i*2);  //a=4 
				for(int j=i;j<length;j+=line) //j=i=0 //1 //for loop for coloumn printing
				{
					newString[count]=s.charAt(j);   //k 
					count++;
					if(a>0 && a<line && j+a<length)
					{
						newString[count]=s.charAt(j+a);
						count++;
					}
				}
			}
	return new String(newString);
  }
    public static void main(String args[])
    {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows");
			int n=sc.nextInt();
			System.out.println("Enter input String");
			String str=sc.next();
			String s=con(str,n);
		System.out.println("output string : "+s);
    }
}