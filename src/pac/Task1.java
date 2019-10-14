package pac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws FileNotFoundException {
	Scanner a = new Scanner (System.in);
	int count = a.nextInt();
	int n = 0;
	while(count>0) {
		count--;
		int h = a.nextInt();
		if (h <= 437) {
			break;
		}
		n++;	
	}
	System.out.println(n);
}
}
