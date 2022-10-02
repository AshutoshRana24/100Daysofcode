//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Java's Scanner.hasNext() method is helpful for this problem.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    int i=0;
    Scanner obj=new Scanner(System.in);
     while(obj.hasNext()==true)
            {
                i=i+1;
                String t=obj.nextLine();
                System.out.printf(i+" "+t+"\n");
            }
    }
}
