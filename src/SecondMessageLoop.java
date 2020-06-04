public class SecondMessageLoop implements Runnable {
    @Override
    public void run() {
        String notSoImportantInfo[] = {
                "Second loop message 1",
                "Second loop message 2"
        };
        try {
            //while i is less the the length of not so important info continue printing
            for (String s : notSoImportantInfo) {
                // Pause for 5 seconds
                Thread.sleep(5000);
                // Print a message from not so important info
                SimpleThreads.threadMessage(s);
            }
        } catch (InterruptedException e) {
            SimpleThreads.threadMessage("Hey you! I wasn't done!");
        }
    }
}
