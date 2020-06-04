public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour = patience).
        long patience = 1000 * 60 * 60;
        //calls the thread number and message
        SimpleThreads.threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        Thread u = new Thread(new SecondMessageLoop());
        u.start();

        SimpleThreads.threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop
        // thread exits
        while (t.isAlive()) {
            //this will print minimum once
            SimpleThreads.threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join(1000);
            u.join(7000);
            //currentTimeMillis - startTime = time program has run
            if (((System.currentTimeMillis() - startTime) > patience)
                    && t.isAlive()) {
                SimpleThreads.threadMessage("Tired of waiting!");
                t.interrupt();
                // Shouldn't be long now
                // -- wait indefinitely
                t.join();
            }
        }

        SimpleThreads.threadMessage("Finally!");
    }
}
