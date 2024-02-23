//String
package DAY1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        int result = lengthOfLongestSubString(string);
        System.out.println(result);
    }
    //Brutal Force approach
//    public static int lengthOfLongestSubString(String s){
//        int n = s.length();
//        int maxLength = 0;
//        for(int i = 0; i < n; i++)
//        {
//            for(int j = i + 1; j <= n; j++)
//            {
//                if(check(s, i, j))
//                {
//                    maxLength = Math.max(maxLength, j-i);
//                }
//            }
//        }
//        return maxLength;
//    }
//    private static boolean check(String s, int a, int b)
//    {
//        for(int i = a; i < b - 1; i++){
//            for(int j = i + 1; j < b; j++){
//                if(s.charAt(i)==s.charAt(j))
//                {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public static int lengthOfLongestSubString(String s){
        int n = s.length();
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < n; j++){
                char cChar =  s.charAt(j);
                if(set.contains(cChar))
                {
                    break;
                }
                set.add(cChar);
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }

}
