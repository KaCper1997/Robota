package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {
// nie wiem o co chodziło z tym wykorzystaniem tej 6 ale działa generalnie
		int n = 6;

		for(n=0; n<=6; n++){
			if(n % 2 == 0){
				System.out.println(n + "-" + "parzysta");
			}
			else{
				System.out.println(n + "-" + "nieparzysta");
			}
		}
		int j =0;
		while( j<=6){
			if(j % 2 == 0){
				System.out.println(j + "-" + "parzysta");
			}
			else{
				System.out.println(j + "-" + "nieparzysta");
			}
			j++;
		}


	}

}
