package pl.coderslab.dtablice;

public class Main05 {

	public static void main(String[] args) {
		/*int[] number ={4, 643, 112, 9999, -69};
		int min = 0;
		for(int i = 0; i < number.length; i++){
			if(number[0] > number[i]){
				min = number[i];
			}
		}
		System.out.println("MIN: " + min);*/

		//Jeśli kod ma być bardziej uniwersalny wydaje mi się że sprawdzenie w ten sposób jest ok
		int[] number ={4, 643, 112, 9999, -69};
		for(int i = 0; i < number.length; i++){
			if(number[1] > number[i]){
				number[1] = number[i];
			}
		}
		System.out.println("MIN: " + number[1]);

	}

}
