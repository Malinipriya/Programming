import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in=new Scanner(System.in);
		int t=in.nextInt(),i=0,j=1,len1,len2,flag=0;
		while(t>0)
		{
			String s=in.next();
			StringBuffer buffer = new StringBuffer(s);
			String reverse = buffer.reverse().toString();
			while(j<s.length())
			{
				len1=s.charAt(j)-s.charAt(i);
				len2=reverse.charAt(j)-reverse.charAt(i);
				if(Math.abs(len1)!=Math.abs(len2))
				{
					flag=1;
					break;
				}
				i++;
				j++;
			}
			if(flag==1)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
			i=0;
			j=1;
			t--;
			flag=0;
		}
    }
}