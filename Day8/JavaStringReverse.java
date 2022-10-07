//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

//Given a string , print Yes if it is a palindrome, print No otherwise.



/*Sample Input:
madam

Sample Output:
Yes*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        int i;char t;String s="";
        Scanner obj=new Scanner(System.in);
        String A=obj.next();
        /* Enter your code here. Print output to STDOUT. */
        int l=A.length();
        for(i=l-1;i>=0;i--)
        {
            t=A.charAt(i);
            s=s+t;
        }
      if(A.compareTo(s)==0)
      {
          System.out.println("Yes");
      }
      else{
          System.out.println("No");
      }
      }
    }
