package aprilTwentyFifth;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;
import java.util.Collections;

import static jdk.nashorn.internal.objects.NativeArray.forEach;


public class TabliceIStrumienie {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) { 
            myArray[i] = i;
        }

        int sum = Arrays.stream(myArray)
                .map(i -> i % 2 !=0 ? i*2 - 1 : i) 
                .map(i -> i % 2 == 0 ? i/2 : i)   
                .sum();                            
                System.out.println(sum);
    }

}
