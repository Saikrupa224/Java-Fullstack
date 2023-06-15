package Day11;

public class ArraySumCalculator {
    private static final int ARRAY_SIZE = 100;
    private static final int NUM_THREADS = 5;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        Thread[] threads = new Thread[NUM_THREADS];
        int partitionSize = ARRAY_SIZE / NUM_THREADS;
        int startIndex = 0;
        int endIndex = partitionSize;

        // Create an array of PartialSumCalculator threads
        PartialSumCalculator[] calculators = new PartialSumCalculator[NUM_THREADS];

        // Divide the array equally into partitions and create threads for each partition
        for (int i = 0; i < NUM_THREADS; i++) {
            final int start = startIndex;
            final int end = endIndex;

            calculators[i] = new PartialSumCalculator(array, start, end);

            startIndex = endIndex;
            endIndex += partitionSize;
        }

        // Start all the threads
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        int finalSum = 0;

        // Wait for all the threads to finish and combine the partial sums
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                System.out.println("partial sum of"+i+"thread is :"+calculators[i].getPartialSum());
                threads[i].join();
                finalSum += calculators[i].getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of array elements: " + finalSum);
    }
}

class PartialSumCalculator implements Runnable {
    private final int[] array;
    private final int start;
    private final int end;
    private int partialSum;

    public PartialSumCalculator(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}

