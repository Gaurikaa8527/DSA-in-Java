import java.util.*;


public class random {
  public static int factorial(int n) {
    int nfact = 1;
    for (int i = 1; i <= n; i++) {
      nfact = nfact * i;
    }
    return nfact;
  }

  public static void main(String[] args) {
    int n = 5;
    int r = 2;
    int nfact = factorial(n);
    int nmrfact = factorial(n - r);
    System.out.println(n + "P" + r + " = " + (nfact / nmrfact));
  }
}