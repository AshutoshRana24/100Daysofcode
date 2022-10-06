/*Given a string,s, and two indices, start and end , print a substring consisting of all characters in the inclusive range from  start to end-1 . 
You'll find the String class' substring method helpful in completing this challenge.*/

//Sample Input
//Helloworld
//3 7

//Sample Output
//lowo



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int start = obj.nextInt();
        int end = obj.nextInt();
        String k=s.substring(start,end);
        System.out.println(k);
    }
}
