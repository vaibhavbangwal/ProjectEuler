import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int max=Integer.MIN_VALUE;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            max=Integer.MIN_VALUE;
            for(int i=100;i<1000;i++){
                for(int j=100;j<1000;j++){
                    if(i*j>max && isPalindrome(i*j) &&i*j<n){
                        max=i*j;
                    }
                }
            }
            System.out.println(max);
        }
        
    }
    public static boolean isPalindrome(int n){
        int temp= n;
        int rev=0;
        int l=0;
        while(n>0){
            l=n%10;
            rev=rev*10+l;
            n/=10;
        }
        if(rev==temp)
            return true;
        else return false;
    }
} 
