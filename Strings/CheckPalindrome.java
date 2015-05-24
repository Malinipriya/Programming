//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
public class Solution 
{
    //The following function makes sure that the string contains only alphanumeric characters.
    public boolean isValid(char c)
    {
        if('a'<=c && c<='z')
            return true;
        if('0'<=c && c<='9')
            return true;
        return false;
    }
    //This function checks if the string is a palindrome.
    public boolean isPalindrome(String s) 
    {
        if(s==null)
            return false;
        if(s.length()==0)
            return true;
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        //Go through every character of the string in forward and in reverse.
        //Check If the character forward and reverse were alphanumeric and match with one another.
        while(left<right)
        {
            while(left<right && !isValid(s.charAt(left)))
            {
                left++;
            }
            while(left<right && !isValid(s.charAt(right)))
            {
                right--;
            }
            if (s.charAt(left)!=s.charAt(right)) 
                return false;
             left++;
             right--;
         }
         
         return true;
       
    }
}