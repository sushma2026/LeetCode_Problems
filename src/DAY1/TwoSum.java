//Array
package DAY1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        System.out.println(Arrays.toString(twoSum(n, arr, target)));
    }

    public static int[] twoSum(int n, int[] arr, int target) {

//        Brutal force approach
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == target)
//                    return new int[]{i, j};
//            }
//        }
//        return new int[]{};
//    }

    Map<Integer, Integer> numtoIndex = new HashMap<>();
        for(
    int i = 0;
    i<n;++i)

    {
        if (numtoIndex.containsKey(target - arr[i])) {
            return new int[]{numtoIndex.get(target - arr[i]), i};

        }
        numtoIndex.put(arr[i], i);
    }
        throw new

    IllegalArgumentException();
}

}
