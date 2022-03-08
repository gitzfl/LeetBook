package com.primary.a1_array;

import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 *
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。
 * 更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 *
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 *
 * 不要使用额外的空间，你必须在 原地 修改输入数组并使用O(1)额外空间的条件下完成
 */
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
