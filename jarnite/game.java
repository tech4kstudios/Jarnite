//Define package
package jarnite;

//Import scanner
import java.util.Scanner;


public class game {
  
  static String cmd;
  static boolean invalid = false;
  
  public static void main(String[] args) throws InterruptedException {
    
    
    while(true){
      
      while (true) {
        
        clear.c();
        
        geolocation.main(args);
        
        System.out.println("Enter command here");
        
        if (invalid) {
          System.out.println("Invalid command!");
          invalid = false;
        }
        
        Scanner input = new Scanner(System.in);
        cmd = input.next();
        
        geolocation.move();
        
        break;
      }
    }
  }
}