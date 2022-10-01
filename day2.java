//Given an array of n integers, find and print its number of negative subarrays on a new line.


import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) {
    //int a[]={1,-2,4,-5,1};
     int c=0,i,j;
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int a[]=new int[n];
     
     for(i=0;i<n;i++)
     {
         a[i]=obj.nextInt();
     }
     for ( i = 0; i < 5; i++) 
     {
            int sum = 0;
            for ( j = i; j < 5; j++) 
            {
                sum+=a[j];
                if(sum <0)
                {
                    c=c+1;
                }
            }
        }
        System.out.println(c);
 
   }   
   }
   
