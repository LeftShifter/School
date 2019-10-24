package pac;

import java.util.Scanner;

public class Each {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ars = sc.nextInt();
		int[] ar = new int [ars];
		for (int i=0; i<ars;i++) {
			ar[i]=sc.nextInt();
		}
		int g=ar[0];
		for (int v:ar) {
			if (v<g) {
				g=v;
			}
		}
		System.out.print(g);
	}
}
