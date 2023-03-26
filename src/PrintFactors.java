import java.util.ArrayList;
import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> factors= new ArrayList<>();
        int num=sc.nextInt();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num%i==0){
                factors.add(i);
            }
        }
        for (int i =factors.size()-1; i >-1; i--) {
            factors.add(num/factors.get(i));
        }


        System.out.println(factors);
    }
}
