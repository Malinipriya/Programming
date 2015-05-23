//Given an input string, reverse the string word by word.
//For example,
//Given s = "the sky is blue",
//return "blue is sky the".

public class Solution 
{
    public String reverseWords(String s) 
    {
        //If the given string is empty, just return an empty string.
        if(s=="" || s.length()==0)
            return "";
            
        //Split the given string by spaces and store the words(excluding spaces) in an array.
        String[] arr=s.split(" ");
        int n=arr.length,i;
        StringBuilder sb=new StringBuilder();
        
        //Traverse through the array in reverse and add every word to the string builder.
        //Do not forget to add spaces in between words.
        for(i=n-1;i>=0;i--)
        {
            if(!arr[i].equals(""))
                sb.append(arr[i]).append(" ");
        }
        
        if(sb.length()==0)
            return "";
            
        //Return the string builder excluding the last space.
        return sb.substring(0, sb.length() - 1);
    }
}