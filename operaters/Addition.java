package operaters;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int num1 , num2;
        Scanner sc =new Scanner(System.in);
        num1=sc.nextInt();
        num2= sc.nextInt();
        int sum =num1+num2;
        int sub = num1-num2;
        System.out.println("Addition " +sum);
        System.out.println("subtraction " +sub);

    }
}
