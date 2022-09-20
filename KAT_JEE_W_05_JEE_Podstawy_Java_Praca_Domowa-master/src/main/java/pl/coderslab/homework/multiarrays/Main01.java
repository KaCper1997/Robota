package pl.coderslab.homework.multiarrays;


public class Main01 {

    public static void main(String[] args) {
        int arr[][] = {
                {2,3,6,1},
                {4,5,6,7}
        };
        System.out.println(oddSum(arr));
    }
    public static int oddSum(int[][] arr){
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]%2==1)
                sum+= arr[i][j];



            }

        }


        return sum ;
    }

}
