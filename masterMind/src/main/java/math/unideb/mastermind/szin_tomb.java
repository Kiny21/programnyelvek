package math.unideb.mastermind;

// @author Kinga
import java.util.ArrayList;
import java.util.Arrays;

public class szin_tomb {

    String p = "piros";
    String k = "kék";
    String z = "zöld";
    String f = "fehér";
    String s = "sárga";
    String l = "lila";
    ArrayList<String> szinek = new ArrayList();
    boolean kapcs = true;
    ArrayList<String> kitalalando = new ArrayList();
    

    public szin_tomb() {

        if (szinek.isEmpty()) {
            szinek.add(p);
            szinek.add(k);
            szinek.add(z);
            szinek.add(f);
            szinek.add(s);
            szinek.add(l);
            System.out.println("A választható színek halmaza: " + szinek);
            System.out.println("-----------------------------------------------------------------");

        }

        while (kapcs) {
            if (kitalalando.size() == 4) {

                System.out.println("A kitalálandó színsorozat: " + kitalalando);
                System.out.println("------------------------------------------");
                break;
            } else {
                String elso = getRandomItem(szinek);
                kitalalando.add(elso);
            }
            
        }

    }

    public static String getRandomItem(ArrayList<String> list) {
        int index = (int) (Math.random() * 6);
        //System.out.println("index: " + index + " item: " + list.get(index));        
        return String.valueOf(list.get(index));
    }

}
