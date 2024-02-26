package DAY2;

import java.util.Scanner;

    public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = s.nextInt();
        }
        int l = 0;
        int r = n - 1;
        int maxWater = 0;
        while(l < r){
            int minHeigth = Math.min(height[l], height[r]);
            int area = minHeigth * (r -l);
            while (height[l] <= minHeigth && l < r)l++;
            while (height[r] <= minHeigth && l < r)r--;
            maxWater = Math.max(maxWater, area);
        }
        System.out.println(maxWater);
    }
}
