/* Given a total and a set of size n of non-negative integers,is there a subset in this set that adds up to the given total? 
 * Worst case time complexity: O(total*n)
 */
import java.util.*;

public class SubsetSum 
{
	public static void findSubset(int total,int n,int[] set)
	{
		//Construct the dynamic programming table by checking if an element in the set can be selected to form the total.
		int i,j;
		boolean[][] t=new boolean[n][total+1];
		for(i=0;i<n;i++)
			t[i][0]=true;
		for(i=0;i<n;i++)
    	{
    		for(j=1;j<total+1;j++)
    		{
    			if(i==0 && j==set[i])
    				t[i][j]=true;
    			else if(i==0)
    				t[i][j]=false;
    			else if(j<set[i])
    				t[i][j]=t[i-1][j];
    			else
    			{
    				if(t[i-1][j]==true)
    					t[i][j]=true;
    				else
    					t[i][j]=t[i-1][j-set[i]];
    			}
    		}
    	}
		//To print the dynamic programming table if required.
		/*for(i=0;i<n;i++)
		{
			for(j=0;j<total+1;j++)
		 	{
		  		System.out.print(t[i][j]+" ");
		    }
		    System.out.println();
		}*/
		//Print "true" if a subset is found that adds up to the given total. Otherwise,print "false".
		System.out.println("Possibility of a subset that adds to the given total:"+t[n-1][total]);
		//Find the subset by tracing back through the DP table.
		ArrayList<Integer> subset=new ArrayList<Integer>();
		if(t[n-1][total]==true)
		{
			i=n-1;
			j=total;
			while(i>0 || j>0)
			{
				if(i!=0 && t[i][j]==t[i-1][j])
					i--;
				else 
				{
					subset.add(0,set[i]);
					j=j-set[i];
					i--;
				}
			}
			System.out.println("The subset is:");
			for(i=0;i<subset.size();i++)
				System.out.print(subset.get(i)+"\t");
		}
	}
	public static void main(String[] args) 
    {
        int total,n,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the total:");
        total=in.nextInt();
        System.out.println("Enter the size of the set:");
        n=in.nextInt();
        System.out.println("Enter the set elements:");
        int[] set=new int[n];
        for(i=0;i<n;i++)
        	set[i]=in.nextInt();
        findSubset(total,n,set);
        in.close();
    }
}
