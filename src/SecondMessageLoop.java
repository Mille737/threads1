public class SecondMessageLoop implements Runnable {
    @Override
    public void run() {
        String notSoImportantInfo[] = {
                "Hello Nadia",
                "Hello Nicolaj"
        };
        try {
            //while i is less the the length of not so important info continue printing
            for (int i = 0; i < notSoImportantInfo.length; i++) {
                // Pause for 2 seconds
                Thread.sleep(5000);
                // Print a message from not so important info
                SimpleThreads.threadMessage(notSoImportantInfo[i]);
            }
        } catch (InterruptedException e) {
            SimpleThreads.threadMessage("Hey you! I wasn't done!");
        }
    }
}
