package DAY1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder revStr = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            revStr.append(str.charAt(i));
        }
        System.out.println(revStr);
    }
}
