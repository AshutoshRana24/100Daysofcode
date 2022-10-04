//Question
//The first line contains a single  integer, n , denoting the size of the array.
//Each line i of the n subsequent lines contains a single integer denoting the value of element ai .


import java.util.Scanner;
public class Solution {
    public static void main(String[] args)  {

       int n,i;
       Scanner obj=new Scanner(System.in);
       n=obj.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=obj.nextInt();
       }
       for(i=0;i<n;i++)
       {
           System.out.println(a[i]);
       }
    }
}
