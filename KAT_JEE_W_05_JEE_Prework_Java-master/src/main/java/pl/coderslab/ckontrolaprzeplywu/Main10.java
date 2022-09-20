package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            String empty = "";
            for(int j = 1; j <= n; j++){
                String star = "* ";
                if(j<=i){
                    System.out.print(star);
                }else
                {
                    System.out.print(j + " ");
                }

            }
            System.out.println(empty);
        }
        for(int i = 5; i <=n && i>0 ; i--){
            String empty = "";
            for(int j = 1; j <= n; j++){
                String star = "* ";
                if(j>i){
                    System.out.print(j+ " ");
                }else{
                    System.out.print(star);
                }
            }
            System.out.println(empty);
        }

    }

}
