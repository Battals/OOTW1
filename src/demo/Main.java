package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);


       /* Collections.rotate(list, -2);
        System.out.println(list);
        System.out.println(list.size());*/


        for (int i = 0; i < 4; i++) {
            int temp = list.get(5);

            for (int j = 5; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }
        System.out.println(list);


    }

}
