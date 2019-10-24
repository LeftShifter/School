package pac;

public class Dc {
	public static int Cows(int number) {
		System.out.println(10);
		if (number ==1 || number ==2 || number ==3) {
			return 1;
		}
		return Cows(number-1)+Cows(number-3); 
	}
}
