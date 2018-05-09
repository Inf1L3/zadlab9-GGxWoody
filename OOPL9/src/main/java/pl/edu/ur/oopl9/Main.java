package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[100];
        Random losuj = new Random();
        for (int i = 0; i < 100; i++) {
            tab[i] = losuj.nextInt();
        }
        bubbleSort(tab);
        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }
        Zad2.zad2();
        ArrayList<Auto> autoBox = new ArrayList<Auto>();
        autoBox.add(new Auto("Skoda", "Nowa", 190, 50000));
        autoBox.add(new Auto("Nissan", "Nowa", 110, 50000));
        autoBox.add(new Auto("WW", "Nowa", 110, 50000));
        autoBox.add(new Auto("Audi", "Nowa", 110, 50000));
        autoBox.add(new Auto("Dewoo", "Nowa", 110, 50000));
        for (int i = 0; i < 5; i++) {
            System.out.println(autoBox.get(i).toString());
        }
    }

    public static void bubbleSort(int[] numArray) {
        int n = numArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }
}
