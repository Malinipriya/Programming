/*
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, 
 * how many coins are required to make the change? Find the minimum number of coins required.
*/
import java.util.*;

public class CoinChangingMinCoins 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
    		c[i][0]=0;
    	for(i=0;i<m;i++)
    	{
    		for(j=1;j<n+1;j++)
    		{
    			if(i==0 && j<d[i])
    				c[i][j]=0;
    			else if(i==0)
    				c[i][j]=j/d[i];
    			else if(j<d[i])
    				c[i][j]=c[i-1][j];
    			else
    				c[i][j]=Math.min(c[i-1][j], 1+c[i][j-d[i]]);
    		}
    	}
    	//To print the dynamic programming table if required.
    	for(i=0;i<m;i++)
    	{
    		for(j=0;j<n+1;j++)
    		{
    			System.out.print(c[i][j]+" ");
    		}
    		System.out.println();
    	}
    	//Print the minimum number of coins which is the required answer.
    	System.out.println(c[m-1][n]);
    	in.close();
    }
}


