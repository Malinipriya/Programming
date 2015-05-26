import java.util.Scanner;
import java.util.ArrayList;
class AlienChefs
{
    public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt(),i=0,q,k,N=n,t,count=0;
		int[] start=new int[n];
    	int[] end=new int[n];
		ArrayList<Integer> recipe=new ArrayList<Integer>();
    	while(n>0)
    	{
    	   start[i]=in.nextInt();
    	   end[i]=in.nextInt();
    	   i++;
    	   n--;
    	}
    	q=in.nextInt();
    	while(q>0)
    	{
    	   k=in.nextInt();
    	   while(k>0)
		   {
				t=in.nextInt();
				for(i=0;i<N;i++)
				{
					if(t>=start[i] && t<=end[i] && !recipe.contains(i))
					{
						recipe.add(i);
						count++;
					}
				}
				k--;
		   }
		   System.out.println(count);
		   count=0;
		   recipe.clear();
		   q--;
    	}
    }
}