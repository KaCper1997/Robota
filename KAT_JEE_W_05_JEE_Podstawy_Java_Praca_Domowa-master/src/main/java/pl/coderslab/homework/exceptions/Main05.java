package pl.coderslab.homework.exceptions;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
        try {
            int[] elements = {2, 4, 5, 4, 2};

            int value = 7;
            System.out.println(indexOf(elements, value));
        } catch (NoSuchElementException e) {
            System.out.println("Brak liczby w tablicy");
        }
    }

    public static int indexOf(int[] elements, int value) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                index = i;
            }
        }
        if (index != -1) {
            return index;
        }else{
            throw new NoSuchElementException();
        }



    }

}
