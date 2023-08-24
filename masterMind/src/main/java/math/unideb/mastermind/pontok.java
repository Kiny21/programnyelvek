/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.unideb.mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kinga
 */
public class pontok extends valasztok {
    List<String> p1_jo_szinek = new ArrayList();
    List<String> p2_jo_szinek = new ArrayList();
   
   
    
  
    
    public Integer p1_jo_hely() {
        Integer p1_jo_helyek_szama = 0;
        for (int i = 0; i < kitalalando.size(); i++) {
            if (kitalalando.get(i).equals(p1_valasztasa.get(i))) {
                p1_jo_helyek_szama++;
            }
        }
        return p1_jo_helyek_szama;
    }

    public Integer p2_jo_hely() {
        Integer p2_jo_helyek_szama = 0;
        for (int i = 0; i < kitalalando.size(); i++) {
            if (kitalalando.get(i).equals(p2_valasztasa.get(i))) {
                p2_jo_helyek_szama++;
            }
        }
        return p2_jo_helyek_szama;
    }

    public Integer p1_jo_szin() {
        Integer p1_jo_szinek_szama = 0;
        
        for (int i = 0; i < p1_valasztasa.size(); i++) {
            String szinem_1 = p1_valasztasa.get(i);
            if (kitalalando.contains(szinem_1)) {
                if(p1_jo_szinek.contains(szinem_1)){
                    continue;                    
                }
                else{
                    p1_jo_szinek.add(szinem_1);
                    p1_jo_szinek_szama++;
                }
                
            }

        }
        return p1_jo_szinek_szama;
    }

    public Integer p2_jo_szin() {
        Integer p2_jo_szinek_szama = 0;
        
        for (int i = 0; i < p2_valasztasa.size(); i++) {
            String szinem_1 = p2_valasztasa.get(i);
              if (kitalalando.contains(szinem_1)) {
                if(p2_jo_szinek.contains(szinem_1)){
                    continue;                    
                }
                else{
                    p2_jo_szinek.add(szinem_1);
                    p2_jo_szinek_szama++;
                }
                
            }

        }
        return p2_jo_szinek_szama;

    }

    public pontok() {

    
        int i=1;

        Integer p1_jo_hely = p1_jo_hely();
        Integer p2_jo_hely = p2_jo_hely();
        Integer p1_jo_szin = p1_jo_szin();
        Integer p2_jo_szin = p2_jo_szin();

        if(p1_jo_hely != 4 || p2_jo_hely != 4){
        System.out.println("---------------------------------------------------");
        System.out.println("Az első játékos színei közül jó helyen volt: " + p1_jo_hely);
         System.out.println("---------------------------------------------------");
        System.out.println("Az első játékos színei közül a tartalmazott színek száma: " + p1_jo_szin);
         System.out.println("---------------------------------------------------");
        System.out.println("Az második játékos színei közül jó helyen volt: " + p2_jo_hely);
         System.out.println("---------------------------------------------------");
        System.out.println("Az második játékos színei közül a tartalmazott színek száma: " + p2_jo_szin);
         System.out.println("---------------------------------------------------");
         

        }
        
        
        
        
        while (p1_jo_hely == 4 || p2_jo_hely == 4) {
            if (p2_jo_hely == 4 && p1_jo_hely == 4) {
                System.out.println("----------------------------------------------");
                System.out.println("Döntetlen! Mindketten egyszerre találtátok ki!");
                System.out.println("-----------------------------------------------");
                break;
            } else if (p1_jo_hely == 4) {
                System.out.println("-----------------------");
                System.out.println("Az első játékos győzőtt");
                System.out.println("-----------------------");
                break;
            } else if (p2_jo_hely == 4) {
                System.out.println("-------------------------");
                System.out.println("A második játékos győzőtt");
                System.out.println("-------------------------");
                break;
            }
        }
    }

}
