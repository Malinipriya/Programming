//Write an algorithm to determine if a number is "happy".
//Example: 19 is a happy number
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
public class Solution 
{
    public boolean isHappy(int n) 
    {
        int sum=0,rem;
        while(n!=0)
        {
            while(n!=0)
            {
                rem=n%10;
                sum+=rem*rem;
                n=n/10;
            }
            if(sum==1)
                return true;
            else if(10-sum>0)
                return false;
            n=sum;
            sum=0;
        }
        return false;
    }
}