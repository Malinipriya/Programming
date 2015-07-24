/*Given two strings, find the longest common substring (ie.,continuous sequence of characters common to both strings).
 * Time Complexity: O(mn) where m and n are the lengths of the first and second string respectively.
 */
import java.util.Scanner;

public class LongestCommonSubstring
{
	public static void findMatch(String c1,String c2)
	{
		int i,j,max=0,maxi=0,maxj=0;
		String common_substring="";
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
					t[i][j]=0;
				else
					t[i][j]=t[i-1][j-1]+1;
				if(t[i][j]>max)
				{
					max=t[i][j];
					maxi=i;
					maxj=j;
				}
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
		//Print the length of the longest common substring which is the required answer.
		System.out.println("Length of the longest common substring is:"+t[maxi][maxj]);
		//Find the longest common substring.
		if(t[maxi][maxj]!=0)
		{
			i=maxi;
			j=maxj;
			while(i>0 || j>0)
			{
				if(t[i][j]!=0)
				{
					common_substring=c2.charAt(i-1)+common_substring;
					i--;
					j--;
				}
				else
					break;
			}
			System.out.println("The longest common substring is:"+common_substring);
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


