package aprilTwentySeventh;

import java.util.Arrays;

public class NaiveSearch {
    public static void main(String[] args) {
        String tekstPrzeszukiwany = "Ala ma kota";
        String tekstSzukany = "kot";
        NaiveSearch naiveSearch = new NaiveSearch();
        naiveSearch.search(tekstPrzeszukiwany, tekstSzukany, true);
    }

    public void search(String tekst, String wzorzec, boolean wielkoscLiter) {
        int dlugoscWzorca = wzorzec.length();
        int dlugoscTekstu = tekst.length();
        int licznik = 0;  // indeksy tabeli
        int licznikWzorca = 0;  //indeksy szukanego tekstu

        if (!wielkoscLiter) {
            tekst = tekst.toLowerCase();
            wzorzec = wzorzec.toLowerCase();
        }

        System.out.println("Indeks występowania wzorca" + licznik);

        while (licznik <= dlugoscTekstu - dlugoscWzorca) {
            licznikWzorca = 0;
            while(licznikWzorca < dlugoscWzorca && wzorzec.charAt(licznikWzorca) == tekst.charAt(licznik+licznikWzorca++));
        }
        if (licznikWzorca == dlugoscWzorca) {
            System.out.println(licznik);
        }
        licznik++;
    }
}

        /*
        String[] tab = {"Ala ma kota"};
        String[] tab2 = {"kot"};
            System.out.println(tab.toString().indexOf("ko"));
        }
    }
        */

