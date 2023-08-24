package math.unideb.primteszt_2;

import java.util.Scanner;

/**
 *
 * @author Kinga
 */
public class PrimTeszt_main_javitott {

    public static void main(String[] args) {
        boolean oszthato = false;
        //Bevezetek egy helyes változót, a while ciklus leállítása miatt.
        boolean helyes = true;
        //A while ciklus során a helytelen bemenetek esetén továbbra is a "helyes" változó értékét megőrzi
        //azaz false lesz, míg ha jó bemenetet adunk meg neki, akkor true-ra állítjuk és ki lép majd belőle.
        while (helyes) {
            //A try-catchet ugyanúgy arra használom, amire megbeszéltük előzőleg. A nextInt() függvénynek a bemenetére,
            //ha más típust adunk meg, mint egy szám, mondjuk String-et, akkor ugye a program leáll. Így mindent amit írtál
            //beleraktam a try ágba, míg a exception/kivétel ágba beleírtam, hogy nem jót adtál meg.
            try {
                System.out.println("Válasszon egy számot!");
                Scanner szam = new Scanner(System.in);
                int valasztott_szam = szam.nextInt();
                //A következő if-re azért van szükség, mivel csak pozitív számot szeretnénk vizsgálni. Így, hogyha
                //negatív számot adunk meg, akkor egyből új számot fog kérni tőlünk. Ezt külön kell kezelnünk, mivel
                //ekkor nem váltódik ki hiba a nextInt()-nél, hiszen negatív szám is szám.
                if (valasztott_szam < 1) {
                    helyes = true;
                    System.out.println("Kérem pozitív számot adjon meg!");
                } else {
                    helyes = false;
                    if (valasztott_szam != 1) {
                        //A for-ciklusban deklarálhatsz is, és akkor így az i változót majd később is fel tudod tetszőlegesen
                        //használni
                        for (int i = 2; i <= valasztott_szam / 2; i++) {
                            if (valasztott_szam % i == 0) {
                                oszthato = true;
                                break;
                            }
                        }
                        if (!oszthato) {
                            System.out.println("A választott szám: " + valasztott_szam + " prím!");
                        } else {
                            System.out.println("A választott szám: " + valasztott_szam + " nem prím!");
                        }
                    } else {
                        System.out.println("A választott szám: " + valasztott_szam + " nem prím!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Nem számot adott meg, hanem mást! Kérem próbálkozzon újra!");
                helyes = true;
            }
        }
    }
}
