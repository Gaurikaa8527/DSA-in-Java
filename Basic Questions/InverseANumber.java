import java.util.*;

public class InverseANumber {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int p = 1;
        int remainder = 1;
        int inverse = 0;
        while(n != 0){
            remainder = n%10;
            inverse = inverse + p*(int)Math.pow(10, remainder -1);
            p++;
            n = n/10;
        }

        System.out.println(inverse);

        scn.close();
        }
    }
    

