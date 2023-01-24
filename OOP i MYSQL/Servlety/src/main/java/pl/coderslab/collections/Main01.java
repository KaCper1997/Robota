package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("");
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
            System.out.print(integer + " ");
        }
        System.out.println("");
        for (Iterator<Integer> iterator2 = arrayList.iterator(); iterator2.hasNext(); ) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println("");
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

    }
}
