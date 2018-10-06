//Define package
package jarnite;

public class load_mv_drive {

    public static void main(String[] args) throws InterruptedException {
      //Convert chars to array
      String message = "[----------------------------------------]";
      char[] chars = message.toCharArray();

      //Print a char from the array, then sleep for specified time
      for (int i = 0; i < chars.length; i++) {
          System.out.print(chars[i]);
          Thread.sleep(50); //2s
      }
    }

}

/*

500 = 20 Seconds = N/A

250 = 10 Seconds = Sneak
175 = 7 Seconds = Walk
125 = 5 Seconds = Run/Sprint
50 = 2 Second = Drive

*/
