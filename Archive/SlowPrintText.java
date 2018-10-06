public class SlowPrintText {

    public static void main(String[] args) throws InterruptedException {
        // Get message, convert to char array
        String message = "[----------------------------------------]";
        char[] chars = message.toCharArray();

        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(125);
        }
        // Repeat for all chars
    }

}

/*

500 = 20 Seconds = N/A

250 = 10 Seconds = Sneak
175 = 7 Seconds = Walk
125 = 5 Seconds = Run/Sprint
50 = 2 Second = Drive

*/