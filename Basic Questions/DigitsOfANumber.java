/*1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.*/

//Also, you cannot use pow function since this is from very basic

import java.util.*;

public class DigitsOfANumber {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int temp = n;       //temporary variable
        int nod = 0;        //no. of digits
        while(temp != 0){
            temp = temp/10;
            nod++;
        }

        //computing divisor
        int div = 1;
        int temp2 = n;
        while(temp >= 10){
            temp2 = temp2/10;
            div = div*10;
        }

        while(div >= 1){
            int quot = n/div;
            int rem = n%div;
            System.out.println(quot);

            n = rem;
            div = div/10;
        }        

        scn.close();
    }
    
}
