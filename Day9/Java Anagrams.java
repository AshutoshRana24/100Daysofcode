//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. 
//For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

//Sample Input 0

//anagram
//margana

//Sample Output 0

//Anagrams








import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner obj=new Scanner(System.in);
    String c=obj.next();
    String d=obj.next();
    String a=c.toLowerCase();
    String b=d.toLowerCase();
    int l=a.length(),i,flag=0;
    char[] charArray1 = a.toCharArray();
      char[] charArray2 = b.toCharArray();
    
    
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    for(i=0;i<l;i++)
    {
        if(charArray1[i]!=charArray2[i])
        {
        System.out.println("Not Anagrams");
        flag=flag+1;
            break;
        }
        
    }
    if(flag==0)
    {
    System.out.println("Anagrams");
    }
}
}
