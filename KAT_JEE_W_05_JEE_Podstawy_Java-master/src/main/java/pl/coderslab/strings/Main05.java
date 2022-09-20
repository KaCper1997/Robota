package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {
        String[] str = {"Ziobro", "Ty", "Kurwo","Przestań","Mi","Rodzine","Prześladować"};

        System.out.println(stringFromArray(str));


    }

    static String stringFromArray(String[] str){
        for(int i =0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }

        return "";
    }
}
