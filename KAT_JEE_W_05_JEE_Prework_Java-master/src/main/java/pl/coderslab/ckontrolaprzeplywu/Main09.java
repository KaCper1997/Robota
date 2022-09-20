package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
       /* int n = 5;
        for(int i =1; i<=1;i++){
            String empty ="";
            for(int j=1; j<=n; j++){
                empty+="*";
                if(j<=n){
                    System.out.println(empty);
                }
            }

        }

        */
        int n = 5;
        for(int i = 1; i<=n; i++){
            String empty ="";
            for(int j = 1; j<=i; j++){
                empty +="*";
            }
            System.out.println(empty);
        }
    }
}
