package operaters;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        num= sc.nextInt();
        if(num%5==0 && num%7==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
