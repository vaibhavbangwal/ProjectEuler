import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner in = new Scanner(System.in);
          int primes []= new int [200001];
            for(int i=0;i<=200000;i++){
                primes[i]=1;
            }
            primes[0]=0;
            primes[1]=0;
            for(int i =2;i<=Math.sqrt(200000);i++){
                if(primes[i]==1){
                    for(int j =2;i*j<=200000;j++){
                        primes[i*j]=0;
                    }
                }
            }
        
        int t = in.nextInt();
        for(int a0=0;a0<t;a0++){
            int n = in.nextInt();
          
            int count=n;
            int i =0;
            while(count>0){
                if(primes[i]==1){
                    count--;
                }
                i++;
            }
            System.out.println(i-1);
}
    }
} 

