//Given a string, find the length of the longest substring without repeating characters.
public class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int maximum=0,i=0,j=0;
        //initialise an array of all 255 ASCII characters to value 'false'.
        boolean[] exist=new boolean[256];
        for(i=0;i<256;i++)
            exist[i]=false;
        i=0;
        //Traverse the given string character by character. 
        //Use the ASCII character array to check for characters that have appeared earlier in the string.
        //The 'maximum' variable keeps track of the longest substring attained at every point of the string.
        while(j<n)
        {
            if(exist[s.charAt(j)])
            {
                maximum=Math.max(maximum,j-i);
                while(s.charAt(i)!=s.charAt(j))
                {
                    exist[s.charAt(i)]=false;
                    i++;
                }
                i++;
                j++;
            }
            else
            {
                exist[s.charAt(j)]=true;
                j++;
            }
        }
        maximum=Math.max(maximum,n-i);
        return maximum;
    }
}