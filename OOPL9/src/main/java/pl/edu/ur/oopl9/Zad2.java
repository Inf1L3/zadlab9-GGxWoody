package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Zad2 {
    public static void zad2(){
        Random losuj = new Random();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < 100; i++) {
            set.add(losuj.nextInt()%100);
        }
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
