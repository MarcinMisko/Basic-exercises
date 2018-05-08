package aprilTwentySeventh;

public class BinarySearch{

        public static void main(String args[])
        {
            BinarySearch binarySearch = new BinarySearch();
            int tablica[] = {2,9,12,32,41,169,687};
            int dlugosc = tablica.length;
            int i = 169;
            int wynik = binarySearch.binarySearch(tablica,0,dlugosc-1, i);
            if (wynik == -1)
                System.out.println("Brak elementu!");
            else
                System.out.println("Element znajduje się pod indeksem " + wynik);
        }

        int binarySearch(int tablica[], int lewa, int prawa, int i){

            if (prawa >= lewa){
                int polowa = lewa + (prawa - lewa)/2;
                if (tablica[polowa] == i)
                return polowa;

                if (tablica[polowa] > i)
                    return binarySearch(tablica, lewa, polowa - 1, i);
                    return binarySearch(tablica, polowa + 1, prawa, i);
        }
        return  -1;
    }
}
