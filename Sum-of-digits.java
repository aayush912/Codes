/*
FIND THE SUM OF DIGITS IN A NUMBER
*/

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int sum = 0;
    while (n != 0){
      sum += n%10;
      n/=10;
    }
    System.out.println (sum);
  }
}
