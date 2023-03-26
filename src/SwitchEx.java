import java.util.Scanner;

import static java.lang.System.*;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        out.println("Enter first day of month");
        String firstday=sc.next().toUpperCase();
        out.println("Enter a number ");
        int a=sc.nextInt();
        switch (a%7){
            case 0 -> out.println("Sunday");
            case 1 -> out.println("Monday");
            case 2 -> out.println("Tuesday");
            case 3 -> out.println("Wednesday");
            case 4 -> out.println("Thursday");
            case 5 -> out.println("Friday");
            case 6 -> out.println("Saturday");
        }

    }
}
