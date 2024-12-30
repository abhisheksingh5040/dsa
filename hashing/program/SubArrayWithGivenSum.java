package hashing.program;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] input = {5, 8, 6, 13, 3, -1};
        int sum = 22;

        boolean result = subArrayWithGivenSum(input, sum);
        System.out.println(result);
    }

    public static boolean subArrayWithGivenSum(int[] arr,int sum){
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr){
            prefixSum += num;
            if(set.contains(prefixSum - sum)){
                return true;
            }

            if(prefixSum == sum){
                return true;
            }

            set.add(prefixSum);
        }

        return false;
    }
}
