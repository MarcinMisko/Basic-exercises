package aprilTwentyFifth;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Collections;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        int liczba = 100;
        boolean isPrime = true;

        if (liczba <= 1 || liczba % 2 == 0){
            isPrime = false;
        }else{
            for (int i = 3; i * 1 <= liczba ; i +=2){                               // zamiast i * i może być: <= Math.sqrt(liczba)
                if (liczba % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Czy liczba jest pierwsza: " + isPrime);

        // ALTERNATYWNE ROZWIĄZANIE Z UŻYCIEM STRUMIENI
        boolean czyPierwsza = IntStream.rangeClosed(2, (int)Math.sqrt(liczba))   // .rangeClosed = określa zakres, w tym przypadku od 2 do pierwiastka z "liczba".
                                                                                    // Rzutowanie do inta: (int)
                                .noneMatch(i -> liczba % i == 0);                   // .noneMatch = zwraca true jeżeli żadna z liczb nie spełni warunku
                                                                                    // .anyMatch = zwraca true jeżeli choć jedna liczba spełni warunek, przeciwieństwo noneMatch

        System.out.println("Czy liczba jest pierwsza: " + czyPierwsza);
    }
}

    /*
    private static void isItPrime(double value) {

       // for (int i = 1; i <= value; i++){
            if ( value % value == 0){
                boolean(Math.sqrt(value));
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }

    }
    */

