package com.primary.a1_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3,3,3,3,3,3};

        int k = removeDuplicates2(nums);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums){
        int count = 0;
        if (nums.length > 1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if(i >= 1){
                    if (nums[i] - nums[i-1] == 0) {
                        count++;
                        System.arraycopy(nums, i, nums, i - 1, nums.length - i);
                    }
                }
            }
        }
        return nums.length - count;
    }

    public static int removeDuplicates2(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
