package operaters;

public class PostandPre {
    public static void main(String[] args) {
        int i=10, j=20;
       int a= ++i;
       int b=--i;
        System.out.println("Pre-increament " + a +" " + b);
        int c=j++;
        int d=j--;
        System.out.println("post-increament " +c +" " +d);

    }
}
