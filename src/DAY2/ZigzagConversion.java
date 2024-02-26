package DAY2;

import java.util.Scanner;

public class ZigzagConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numRows = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        int n = str.length();
        StringBuffer[] arr = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuffer();
        }
        int k = 0;
        while (k < n) {
            for (int i = 0; i < numRows && k < n; i++) {
                arr[i].append(str.charAt(k++));
            }
            for (int i = numRows - 2; i >= 1 && k < n; i--) {
                arr[i].append(str.charAt(k++));
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuffer i : arr) {
            result.append(i);
        }
        System.out.println(result.toString());
    }
}
