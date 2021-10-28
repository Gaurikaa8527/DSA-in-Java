/*1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).*/

import java.util.*;

public class IsAnumberPrime {

public static void main(String[] args){

    System.out.println("HELkjdlsha");
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();      //number of inputs

    for(int i = 1; i <= t; i++){
        int n = scn.nextInt();

        int count = 0;
        for(int divisor = 2; divisor*divisor <= n; divisor++){
            if(n%divisor == 0){
                count++;
                break;
            }
          }

          if(count == 0){
              System.out.println("prime");
          }else{
              System.out.println("Not prime");
          }
        }

        scn.close();

    }
}
