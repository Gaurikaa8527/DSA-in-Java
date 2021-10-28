/*  1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.*/


    //special case = 46
    
import java.util.*;

public class PrimeFactorization {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                n = n/i;
                System.out.println(i + " ");
            }  
        }

        System.out.println(n);

        scn.close();
    }
    
}
