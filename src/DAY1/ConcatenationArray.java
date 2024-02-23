package DAY1;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] =s.nextInt();
        }
        System.out.println(Arrays.toString(concatenation(arr)));
    }
    public static int[] concatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;

    }
}
