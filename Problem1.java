import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
             System.out.println(findSum(n,3)+findSum(n,5)-findSum(n,15));
            
        }
            
    }
    public static long findSum(long n,long p){
        long temp = (n-1)/p;
       long sum;
        sum=p*(temp*(temp+1)/2);
        return sum;
    }
}