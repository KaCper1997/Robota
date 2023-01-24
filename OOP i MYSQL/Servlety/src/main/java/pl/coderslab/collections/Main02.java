package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main02 {

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
        removeDivider(arrayList,2);

    }
    public static  void removeDivider(List<Integer> arrayList, int divider) {
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                Integer integer = it.next();
                System.out.print(integer + " ");
            }
        }


        }
    }

