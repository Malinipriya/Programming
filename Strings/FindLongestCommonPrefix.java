//Write a function to find the longest common prefix string amongst an array of strings.
public class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
            return "";
        int i,j;
        //Set the first string of the given array as the prefix because the first string itself could be the longest common prefix.
        String prefix=strs[0];
        //Go through every string in the array and see if the string matches the prefix.
        //Otherwise alter the prefix accordingly.
        for(i=0;i<strs.length;i++)
        {
            for(j=0;j<strs[i].length() && j<prefix.length();j++)
            {
                if(strs[i].charAt(j)!=prefix.charAt(j))
                    break;
            }
            prefix=prefix.substring(0,j);
        }
        return prefix;
    }
}