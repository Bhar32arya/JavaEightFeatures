package org.example;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int []arr = new int[]{-1, -2, -3, -4, -5};
        int []arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(findMaxSum(3, arr2));
    }

    public static int findMaxSum(int k, int []arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 1;
        int sum = 0;
        while(j < arr.length) {
            sum = sum + arr[j];
            if(j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
