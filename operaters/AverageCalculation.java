package operaters;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        int n1, n2,n3, n4,n5;
        Scanner sc= new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        int avg=(n1+n2+n3+n4+n5)/5;
        System.out.println("The Average " + avg);
    }
}
