package VirtualThreads40;

public class TraditionalThreads {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            int id = i;

            new Thread(() -> {
                System.out.println("Thread " + id);
            }).start();
        }

        Thread.sleep(3000);

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}

