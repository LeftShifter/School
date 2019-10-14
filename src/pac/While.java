package pac;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class While {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\User\\eclipse-workspace\\ize\\While.txt "));
		int s = 0;
		while (in.hasNext()) {
			int a = in.nextInt();
			if (a<0) {break;}
			s+=a;
			System.out.println(s);
		}
	}

}
