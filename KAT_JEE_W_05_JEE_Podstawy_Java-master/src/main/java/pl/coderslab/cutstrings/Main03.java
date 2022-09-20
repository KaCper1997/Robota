package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {
        String str = "To jest tekst do pizdy generalnie ";
        System.out.println(countTokens(str));

    }

    public static int countTokens(String str) {
        String []parts = str.split(" ");
        int count = 0;
        for(int i = 0; i < parts.length; i++){
            count =+ i+1;

        }

        return count;
    }

}

