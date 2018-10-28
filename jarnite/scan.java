package jarnite;

import java.util.Scanner;

public class scan {
  
  static String in;
  static String in2;
  
  public static void s() {
    
    Scanner input = new Scanner(System.in);
    String in2 = input.next();
    in = in2;
    System.out.println(in);
  }
}