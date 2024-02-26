package DAY2;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int maxLen = 1;
        String max = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + maxLen; j <= str.length(); j++) {
                if (j - i > maxLen && isPalindrome(str.substring(i, j))) {
                    maxLen = j - i;
                    max = str.substring(i, j);
                }
            }
        }
        System.out.println(max);
    }
     private static boolean isPalindrome(String str){
        int l = 0;
        int r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
     }
}
