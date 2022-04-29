

import java.util.*;

public class Himpunan {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("1");
        s1.add("2");
        s1.add("3");
        s1.add("4");
        s1.add("5");

        Set s2 = new HashSet();
        s2.add("5");
        s2.add("6");
        s2.add("7");
        s2.add("8");
        s2.add("9");
        s2.add("10");

        Set union = new TreeSet(s2);
        union.addAll(s1); //untuk menggabungkan
        print("Gabungan", union);

        Set intersect = new TreeSet(s1);
        intersect.retainAll(s2); //untuk interseksi
        print("irisan",intersect);

        Set min = new TreeSet(s1);
        min.removeAll(s2);
        print("min",min);

        Set himpunanBagian = new TreeSet(s1);
        himpunanBagian.containsAll(s2); //himpunan bagian
        print("Bagian",himpunanBagian);


    }
    protected static void print(String label,Collection c){
        System.out.println("--------------" + label + "--------------");
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}