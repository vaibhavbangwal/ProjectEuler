import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int primes[] = new int[1000000+1];
            for(int i =0;i<=1000000;i++){
                primes[i]=1;
        }
            primes[0]=0;
            primes[1]=0;
            for(int i=2;i<=Math.sqrt(1000000);i++){
                if(primes[i]==1){
                    for(int j=2;i*j<=1000000;j++){
                        primes[i*j]=0;
                }
            }
            }
         
        long sumArray []= new long[1000000+1];
        sumArray[0]=0;
        sumArray[1]=0;
            for(int i=2;i<=1000000;i++){
                if(primes[i]==1 ){
                sumArray[i]=sumArray[i-1]+i;
                }
                else{
                    sumArray[i]=sumArray[i-1];
                }
            }
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
           System.out.println(sumArray[n]);
}
    }
}
