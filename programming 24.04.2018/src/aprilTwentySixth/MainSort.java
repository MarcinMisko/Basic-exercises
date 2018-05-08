package aprilTwentySixth;

public class MainSort {
    public static void main(String[] args) {
        int[] array = {17, 5, 9, -70, 8, 6, 3, 132, -4, 68, 512};
        new BubbleSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] array2 = {17, 5, 9, -70, 8, 6, 3, 132, -4, 68, 512};
        new HeapSort().sort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        Silnia silnia = new Silnia();

        System.out.println("-------------------------");
        System.out.println(silnia.silniaRekurencja(5));


    }
}
