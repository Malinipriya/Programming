import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram
{
	public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		int found=1,i;
		char letters[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String s1=s.toLowerCase();
		for(i=0;i<26;i++)
		{
			if(!s1.contains(Character.toString(letters[i])))
			{
				found=0;
				//System.out.println(letters[i]);
				break;
			}
		}
		if(found==1)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
    }
}