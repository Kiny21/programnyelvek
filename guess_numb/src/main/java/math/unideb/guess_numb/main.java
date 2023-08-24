package math.unideb.guess_numb;

// @author Kinga
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void jatek(int i) {
        ArrayList<Integer> kitalalando_szam = new ArrayList();
        int pont_p1 = 0;
        int pont_p2 = 0;
        int nyertes_pont = 2;
        boolean helyes = true;

        while (nyertes_pont != pont_p1 && nyertes_pont != pont_p2) {
            System.out.println("--------------------------------------------------");
            System.out.println("Kérem válasszon egy számot 0 és " + i + " között!");
            System.out.println("--------------------------------------------------");

            
            if (kitalalando_szam.isEmpty()) {
                Random rand = new Random();
                int szam = rand.nextInt(i + 1);
                kitalalando_szam.add(szam);
            } else {
                kitalalando_szam.clear();
                Random rand = new Random();
                int szam = rand.nextInt(i + 1);
                kitalalando_szam.add(szam);

            }
            helyes = true;

            System.out.println(kitalalando_szam);

            while (helyes) {

                try {

                    System.out.println("--------------------------------");
                    System.out.println("Első játékos adja meg a tippjét!");
                    System.out.println("--------------------------------------------------");
                    Scanner p1_valasztasa = new Scanner(System.in);
                    int p1_szama = p1_valasztasa.nextInt();
                    helyes = false;


                    if (p1_szama >= 0 && p1_szama <= i) {
                        if (kitalalando_szam.contains(p1_szama)) {
                            System.out.println("--------------------------------");
                            System.out.println("Első játékos eltalálta a számot!");
                            System.out.println("--------------------------------------------------");
                            pont_p1 = pont_p1 + 1;
                        }else{
                            System.out.println("-----------");
                            System.out.println("Nem talált!");
                            System.out.println("-----------");
                        } 
                    }else {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Nem megfelelő intervallumból választott számot! Próbálkozzon újra!");
                            System.out.println("--------------------------------------------------");
                        }
                    
                    
                    System.out.println("-----------------------------------");
                    System.out.println("Második játékos adja meg a tippjét!");
                    System.out.println("--------------------------------------------------");
                    Scanner p2_valasztasa = new Scanner(System.in);
                    int p2_szama = p2_valasztasa.nextInt();
                    helyes = false;
                    
                    if (p2_szama >= 0 && p2_szama <= i) {

                        if (kitalalando_szam.contains(p2_szama)) {
                            System.out.println("-----------------------------------");
                            System.out.println("Második játékos eltalálta a számot!");
                            System.out.println("--------------------------------------------------");
                            pont_p2 = pont_p2 + 1;
                        }else{
                            System.out.println("-----------");
                            System.out.println("Nem talált!");
                            System.out.println("-----------");
                        }
                    }else {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Nem megfelelő intervallumból választott számot! Próbálkozzon újra!");
                            System.out.println("--------------------------------------------------");
                        }
                    
                    
                    
                    if (p1_szama >= 0 && p2_szama >= 0 && p1_szama <= i && p2_szama <= i) {

                        if (p2_szama == p1_szama) {
                            if (kitalalando_szam.contains(p1_szama)) {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Mindketten eltaláltátok a számot! Döntetlen");
                                System.out.println("--------------------------------------------------");
                            } else {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Egyikőtök sem találta el a számot!");
                                System.out.println("--------------------------------------------------");

                            }
                        }

                    }if(p1_szama==2){                        
                      System.out.println("------------------------");
                      System.out.println("Az első játékos győzőtt!");
                      System.out.println("------------------------");
                    }if(p2_szama==2){
                      System.out.println("--------------------------");
                      System.out.println("A második játékos győzőtt!");
                       System.out.println("--------------------------");
                        
                    }
                    
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("A kitalálandó szám: " + kitalalando_szam + " volt.");
                    System.out.println("--------------------------------------------------");

                    System.out.println("--------------------------------------------------");
                    System.out.println("A jelenlegi állás: " + pont_p1 + " : " + pont_p2);
                    System.out.println("------------------------------");

                } catch (Exception e) {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("Nem megfelelő értéket adott meg! Kérem válasszon egy számot a megfelelő intervallumból!");
                    System.out.println("--------------------------------------------------");
                    helyes = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        jatek(5);
    }

}
