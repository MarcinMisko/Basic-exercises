package aprilTwentyFifth;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] array = {2,5,9,7,8,6,3,1,4,68,512};
        sortBubble(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static int[] sortBubble(int[] array) {
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
        return array;
    }
}
