package pl.coderslab.homework.strings;


public class Main04 {

    public static void main(String[] args) {
        String str = "aaawsxbbbsxdeee";
        System.out.println(tripple(str));


    }

    public static int tripple(String str) {
        char[] arr = str.toCharArray();
        int licznik = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && arr[i - 1] == arr[i - 2]) {
                licznik++;

            }
        }
        return licznik;
    }

}
