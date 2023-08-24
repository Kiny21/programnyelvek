package math.unideb.mastermind;

// @author Kinga
import java.util.ArrayList;
import java.util.Scanner;

public class valasztok extends szin_tomb{

    ArrayList<String> p1_valasztasa = new ArrayList();
    ArrayList<String> p2_valasztasa = new ArrayList();

    
    boolean kapcs_1 = true;
    boolean kapcs_2 = true;
    boolean tomb = true;

    public valasztok() {

        System.out.println("Első játékos adja meg a tippjét!");

        while (kapcs_1) {
            while (tomb) {

                if (p1_valasztasa.size() == 4) {
                    System.out.println(p1_valasztasa);
                    System.out.println("------------------------------");
                    kapcs_1 = false;
                    break;

                } else {
                    Scanner elso_jatekos = new Scanner(System.in);
                    String elso = elso_jatekos.next();

                    if ("lila".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else if ("piros".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else if ("kék".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else if ("fehér".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else if ("zöld".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else if ("sárga".equals(elso)) {
                        p1_valasztasa.add(elso);
                        tomb = false;
                        kapcs_1 = false;

                    } else {
                        System.out.println("Kérem a színhalmazból válasszon!");
                        tomb = true;
                        kapcs_1 = true;
                    }
                }
                tomb = true;

            }
        }

        System.out.println("Második játékos adja meg a tippjét!");

        while (kapcs_2) {
            while (tomb) {

                if (p2_valasztasa.size() == 4) {
                    System.out.println(p2_valasztasa);
                    System.out.println("--------------------------------------------");
                    kapcs_2 = false;
                    break;
                } else {
                    Scanner masodik_jatekos = new Scanner(System.in);
                    String masodik = masodik_jatekos.next();

                    if ("lila".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;

                    } else if ("piros".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;

                    } else if ("kék".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;

                    } else if ("fehér".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;

                    } else if ("zöld".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;

                    } else if ("sárga".equals(masodik)) {
                        p2_valasztasa.add(masodik);
                        tomb = false;
                        kapcs_2 = false;
                    } else {
                        System.out.println("Kérem a színhalmazból válasszon!");
                        tomb = true;
                        kapcs_1 = true;
                    }
                }
                tomb = true;

            }

        }
    }
}
