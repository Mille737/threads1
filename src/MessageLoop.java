public class MessageLoop implements Runnable {
    public void run() {
        // messages that will be printed
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        try {
            //while i is less the the length of important info continue printing
            for (int i = 0; i < importantInfo.length; i++) {
                // Pause for 4 seconds
                Thread.sleep(4000);
                // Print a message from important info
                SimpleThreads.threadMessage(importantInfo[i]);
            }
        } catch (InterruptedException e) {
            SimpleThreads.threadMessage("I wasn't done!");
        }
    }
}
