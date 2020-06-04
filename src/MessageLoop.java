public class MessageLoop implements Runnable {
    public void run() {
        // messages that will be printed
        String[] importantInfo = {
                "Message one",
                "Message two",
                "Message three",
                "Message four"
        };
        try {
            //while i is less the the length of important info continue printing
            for (String s : importantInfo) {
                // Pause for 4 seconds
                Thread.sleep(4000);
                    // Print a message from important info
                    SimpleThreads.threadMessage(s);
            }
        } catch (InterruptedException e) {
            SimpleThreads.threadMessage("I wasn't done!");
        }
    }
}
