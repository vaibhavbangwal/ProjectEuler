import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum=0;
        for(int a0 = 0; a0 < t; a0++){
            sum=0;
            long n = in.nextLong();
            long mem[] = new long[3];
            mem[0]=1;
            mem[1]=1;
            for(int j=2;j<n-1;j++){
                mem[2]=mem[1]+mem[0];
                if(mem[2]>n)
                    break;
                if(mem[2]%2==0)
                    sum+=mem[2];
                mem[0]=mem[1];
                mem[1]=mem[2];
            }
            System.out.println(sum);
        }
    }
}
