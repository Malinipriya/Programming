/*Given two strings, find the longest common subsequence.
 * Time Complexity: O(mn) where m and n are the lengths of the first and second string respectively.
 */
import java.util.Scanner;

public class LongestCommonSubsequence 
{
	public static void findMatch(String c1,String c2)
	{
		int i,j;
		String common_subsequence="";
		//Construct the dynamic programming table by checking match between two strings.
		int[][] t=new int[c2.length()+1][c1.length()+1];
		for(i=0;i<c2.length()+1;i++)
			t[i][0]=0;
		for(j=0;j<c1.length()+1;j++)
			t[0][j]=0;
		for(i=1;i<c2.length()+1;i++)
		{
			for(j=1;j<c1.length()+1;j++)
			{
				if(i==1 && c1.indexOf(c2.charAt(i-1))!=-1)
					t[i][j]=1;
				else if(i==1)
					t[i][j]=0;
				else if(c1.charAt(j-1)!=c2.charAt(i-1))
					t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
				else
					t[i][j]=t[i-1][j-1]+1;
			}
		}
		//To print the dynamic programming table if required.
		for(i=0;i<c2.length()+1;i++)
    	{
    		for(j=0;j<c1.length()+1;j++)
    		{
    			System.out.print(t[i][j]+" ");
    		}
    		System.out.println();
    	}
		//Print the length of the longest common subsequence which is the required answer.
		System.out.println("Length of the longest common subsequence is:"+t[c2.length()][c1.length()]);
		//Find the longest common subsequence.
		if(t[c2.length()][c1.length()]!=0)
		{
			i=c2.length();
			j=c1.length();
			while(i>0 || j>0)
			{
				if(t[i][j]!=t[i-1][j-1] && t[i][j]!=t[i-1][j] && t[i][j]!=t[i][j-1])
				{
					common_subsequence=c2.charAt(i-1)+common_subsequence;
					i--;
					j--;
				}
				else if(t[i][j]==t[i-1][j])
					i--;
				else
					j--;
			}
			System.out.println("The longest common subsequence is:"+common_subsequence);
		}
	}
	public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1=in.next(),s2=in.next();
        findMatch(s1,s2);
        in.close();
    }
}
