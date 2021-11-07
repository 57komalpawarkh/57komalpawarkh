import java.util.*;
public class StringReturnLength 
{
 static int lengthLast(String str1)
    {
        String words[] = str1.split(" "); //splitting string at every space and storring every word as string array element
		
        if(words.length>0)  //length of array>0
			{
				return words[words.length-1].length();	//if there are 2 words
														//array length=2: words[1].length()=last word length		
			} 
		else
			{
				return 0;
			}
    }	
	 public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Length of the last word : "+lengthLast(str1));
     }
}
