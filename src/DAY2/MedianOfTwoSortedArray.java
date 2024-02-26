package DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num1 = new int[n];
        for (int i = 0; i < n; i++) {
            num1[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i] = s.nextInt();
        }

        int[] merge = new int[n+m];
        int k = 0;

        for (int i = 0; i < n; i++){
            merge[k++] = num1[i];
        }
        for(int i = 0; i < m; i++){
            merge[k++] = num2[i];
        }
        Arrays.sort(merge);
        int total = merge.length;
        double result;
        if(total % 2 == 1){
            result = merge[total / 2];
        }
        else {
            int m1 = merge[total / 2 - 1];
            int m2 = merge[total / 2];
            result = (double) (m1 + m2) / 2;
        }
        System.out.println(result);
    }
}
