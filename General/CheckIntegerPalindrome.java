//Determine whether an integer is a palindrome. Do this without extra space.
public class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
            return false;
        int left,right,div=1,num=x;
        //Find the place of a given.
        //For ex: if x=12321, then 10000 gets stored in div afer the following loop is run.
        while((num/10)!=0)
        {
            div*=10;
            num=num/10;
        }
        //Take the digits in left and right correspondingly. Compare them. If they aren't equal, the given number is not a plaindrome.
        while(x!=0)
        {
            left=x/div;
            right=x%10;
            if(left!=right)
                return false;
            x=x%div;
            x=x/10;
            div/=100;
        }
        return true;
    }
}