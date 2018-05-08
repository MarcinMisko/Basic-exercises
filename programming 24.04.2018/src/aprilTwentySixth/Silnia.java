package aprilTwentySixth;
// silnia to iloczyn wszystkich liczb do tej liczby włącznie (5! = 1 * 2 * 3 * 4 * 5 = 120)
public class Silnia {
    public int silniaRekurencja (int n){
        if (n < 2) {
            return  1;
        }

        return n * silniaRekurencja(n -1);
    }
}
