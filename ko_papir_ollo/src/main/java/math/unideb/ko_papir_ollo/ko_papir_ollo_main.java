package math.unideb.ko_papir_ollo;

import java.util.Scanner;

public class ko_papir_ollo_main {

    public static void main(String[] args) {
        int elso_jatekos_pont = 0;
        int masodik_jatekos_pont = 0;
        int gyoztes_ertek = 2;

        String elso_jatekos_valasztasa;
        String masodik_jatekos_valasztasa;
        System.out.println("Köszöntjük a játékosokat!");

        while (gyoztes_ertek!=elso_jatekos_pont && gyoztes_ertek!=masodik_jatekos_pont ) {
            System.out.println("Első játékos választ: ");
            Scanner beolvasott_elso_jatekos = new Scanner(System.in);
            elso_jatekos_valasztasa = beolvasott_elso_jatekos.next();
            System.out.println("Második játékos választ: ");
            Scanner beolvasott_masodik_jatekos = new Scanner(System.in);
            masodik_jatekos_valasztasa = beolvasott_masodik_jatekos.next();

            if ("papir".equals(elso_jatekos_valasztasa) && "ko".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Első játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                elso_jatekos_pont = elso_jatekos_pont + 1;
            } else if ("ko".equals(elso_jatekos_valasztasa) && "papir".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Második játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                masodik_jatekos_pont = masodik_jatekos_pont + 1;
            } else if ("papir".equals(elso_jatekos_valasztasa) && "ollo".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Második játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                masodik_jatekos_pont = masodik_jatekos_pont + 1;
            } else if ("ollo".equals(elso_jatekos_valasztasa) && "papir".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Elso játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                elso_jatekos_pont = elso_jatekos_pont + 1;
            } else if ("ko".equals(elso_jatekos_valasztasa) && "ollo".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Elso játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                elso_jatekos_pont = elso_jatekos_pont + 1;
            } else if ("ollo".equals(elso_jatekos_valasztasa) && "ko".equals(masodik_jatekos_valasztasa)) {
                System.out.println("-------------------");
                System.out.println("Második játékos nyerte ezt a menetet!");
                System.out.println("-------------------");
                masodik_jatekos_pont = masodik_jatekos_pont + 1;
            } else {
                System.out.println("Ez a menet döntetlen lett, mindkét játékos ugyanazt választotta!");
            }
            System.out.println("Eredmény: " + elso_jatekos_pont + " : " + masodik_jatekos_pont);

        }
    }

}
