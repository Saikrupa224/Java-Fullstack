package Day10;

public class NumberRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            NumberRunnable numberRunnable = new NumberRunnable();
            Thread thread = new Thread(numberRunnable);
            thread.start();
        }
    }

