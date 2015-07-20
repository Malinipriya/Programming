/*Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, 
 * how many ways can we make the change? The order of coins doesn’t matter.
 */

//Time Complexity: O(mn)
import java.util.*;

public class CoinChangingMinWays
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
    	//n denotes the amount that we are trying to find the change for.
    	//m denotes the number of denominations given to us to find the change.
    	int n=in.nextInt();
    	int m=in.nextInt(),i,j;
    	int[] d=new int[m];
    	for(i=0;i<m;i++)
    		d[i]=in.nextInt();
    	
    	Arrays.sort(d);
    	int[][] c=new int[m][n+1];
    	for(i=0;i<m;i++)
    		c[i][0]=1;
    	for(i=0;i<m;i++)
    	{
    		for(j=1;j<n+1;j++)
    		{
    			if(i==0 && j<d[i])
    				c[i][j]=-1;
    			else if(i==0)
    				c[i][j]=1;
    			else if(j<d[i])
    				c[i][j]=c[i-1][j];
    			else
    				c[i][j]=c[i-1][j]+c[i][j-d[i]];
    		}
    	}
    	//To print the dynamic programming table if required.
    	/*for(i=0;i<m;i++)
    	{
    		for(j=0;j<n+1;j++)
    		{
    			System.out.print(c[i][j]+" ");
    		}
    		System.out.println();
    	}*/
    	//Print the minimum number of coins which is the required answer.
    	System.out.println(c[m-1][n]);
    	in.close();
    }
}
