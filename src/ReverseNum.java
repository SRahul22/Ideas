import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int reversenum=0;
        while(temp!=0){
            int remainder=temp%10;
            reversenum=reversenum*10+remainder;
            temp=temp/10;

        }
        System.out.println(reversenum);

    }
}
