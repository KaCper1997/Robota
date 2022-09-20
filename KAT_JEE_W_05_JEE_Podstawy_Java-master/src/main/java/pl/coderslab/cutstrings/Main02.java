package pl.coderslab.cutstrings;

public class Main02 {

    public static void main(String[] args) {

        String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę." +
                " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
                " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy znaleźć zatrudnienie po kursie.";

        String [] parts = str.split("[.]");
        System.out.println(parts.length);
        for(int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }

}

