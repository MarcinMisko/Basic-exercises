package aprilTwentySixth;

public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

