package pl.coderslab.dtablice;

public class Main07 {
	//to zadanie jest chujowe nie umiem

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		double [] celcius = new double[13];
		double sum = 0.0;
		for(int i = 0; i < temps.length; i++) {
			 celcius[i] = temps[i] * 1.8 + 32;
			temps[i] = celcius[i];
			sum += celcius[i];
			System.out.print(celcius[i] +" ");

		}
		double avg = 0;
		avg = sum/ celcius.length;

		//avg =Math.round(sum/ celcius.length);

		System.out.println("\n");
		System.out.println("SUMA: " + sum);


		System.out.println("ŚREDNIA; " + avg);


	}

}


