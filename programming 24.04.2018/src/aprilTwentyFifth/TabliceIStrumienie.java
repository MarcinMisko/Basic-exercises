package aprilTwentyFifth;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;
import java.util.Collections;

import static jdk.nashorn.internal.objects.NativeArray.forEach;


public class TabliceIStrumienie {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) { // wypełniamy tablicę kolejnymi wartościami od 1 do 10
            myArray[i] = i;
        }

        int sum = Arrays.stream(myArray)
                .map(i -> i % 2 !=0 ? i*2 - 1 : i) // co drugą liczbę zwiększamy o wartość jej poprzednika
                .map(i -> i % 2 == 0 ? i/2 : i)    // każdą liczbę parzystą dzielimy przez 2
                .sum();                            // sumujemy wszystkie liczby w tablicy, wynik = 55 (trzeba dopisać int sum = przed Arrays
                System.out.println(sum);
    }

}
