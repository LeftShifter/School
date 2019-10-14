package pac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;




public class Gg {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader objReader = new BufferedReader (
					new FileReader("E:\\txt1.txt"));
			PrintWriter out = new PrintWriter(new File("out.txt"));
			int digitFromFile = Integer.parseInt(objReader.readLine());
			int digitFromFile2 = Integer.parseInt(objReader.readLine());
			char symbol = digitFromFile > digitFromFile2 ? '>' : (digitFromFile < digitFromFile2 ? '<' : '=');
			
	}
}
