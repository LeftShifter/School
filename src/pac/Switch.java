package pac;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Switch {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File ("C:\\Users\\User\\eclipse-workspace\\ize\\Switch.txt"));
        int day = in.nextInt();

        switch (day) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("unknown");
        }
    }
}