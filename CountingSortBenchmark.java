import java.util.Random;

public class CountingSortBenchmark {

    private static final int DATASET_SIZE = 10_000_000;
    private static final int MAX_VALUE = 10000;
    private static final int TEST_RUNS = 3;

    public static void countingSort(int[] array, int maxValue) {

        int[] count = new int[maxValue + 1];

        for (int value : array) {
            count[value]++;
        }

        int index = 0;

        for (int i = 0; i <= maxValue; i++) {

            while (count[i] > 0) {
                array[index] = i;
                index++;
                count[i]--;
            }

        }
    }

    public static boolean verifySorted(int[] array) {

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i - 1]) {
                return false;
            }

        }

        return true;
    }

    public static int[] generateDataset() {

        Random random = new Random();

        int[] dataset = new int[DATASET_SIZE];

        for (int i = 0; i < DATASET_SIZE; i++) {

            dataset[i] = random.nextInt(MAX_VALUE + 1);

        }

        return dataset;
    }

    public static void main(String[] args) {

        double totalExecutionTime = 0;

        System.out.println("COUNTING SORT PERFORMANCE BENCHMARK");
        System.out.println("------------------------------------");
        System.out.println("Dataset Size: " + DATASET_SIZE);
        System.out.println("Value Range: 0 - " + MAX_VALUE);
        System.out.println("Benchmark Runs: " + TEST_RUNS);
        System.out.println();

        for (int run = 1; run <= TEST_RUNS; run++) {

            System.out.println("Run " + run + " starting...");

            int[] data = generateDataset();

            long startTime = System.nanoTime();

            countingSort(data, MAX_VALUE);

            long endTime = System.nanoTime();

            double executionTime = (endTime - startTime) / 1_000_000_000.0;

            totalExecutionTime += executionTime;

            boolean sortedCorrectly = verifySorted(data);

            System.out.println("Execution Time: " + executionTime + " seconds");
            System.out.println("Sorted Correctly: " + sortedCorrectly);
            System.out.println();

        }

        double averageTime = totalExecutionTime / TEST_RUNS;

        System.out.println("------------------------------------");
        System.out.println("Average Execution Time: " + averageTime + " seconds");

    }
}
