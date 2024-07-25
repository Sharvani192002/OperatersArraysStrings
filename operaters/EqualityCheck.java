package operaters;

import java.util.Arrays;

public class EqualityCheck {
    public static void main(String[] args) {
        String str1="rinky";
        String str2="rinky";
        char [] a1= str1.toCharArray();
        char [] a2= str1.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
}
