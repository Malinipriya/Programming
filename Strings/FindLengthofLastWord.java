//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//If the last word does not exist, return 0.
public class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        //If the string is empty, there are no words and hence return 0.
        if(s.length()==0)
            return 0;
        int i,length_lastword=0,flag=0;
        //Traverse from the last character of the string, till a non-space character is found.
        //If a non-space character is found, keep incrementing length_lastword from that point till the point where a space is found again.
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                flag=1;
                length_lastword++;
                if(i>0)
                    continue;
            }
            if(flag==1)
                return length_lastword;
        }
        return 0;
    }
}