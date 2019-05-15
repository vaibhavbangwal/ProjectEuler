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
            int n = in.nextInt();
           
            int count=n;
            int k=1;
            while( count>0 ){
                for(int l=1;l<=n;l++){
                   
                  if(k%l==0){
                        count--;
                        
                    }
                    else{
                        count=n;
                        k++;
                        break;
                    }
                }
            }
            System.out.println(k);
        }
    }
}
