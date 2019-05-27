package summary;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 *
 */


public class rotate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution1(nums,k);
    }




    private static void solution1(int[] nums, int k) {
        while (nums.length<k){k = k-nums.length;}
        int len = nums.length;
        int[] res = new int[len];
        int[] s1 =  Arrays.copyOfRange(nums, 0, len-k);
        int[] s2 =  Arrays.copyOfRange(nums, len-k, len);
        System.arraycopy(s2, 0, res, 0, s2.length);
        System.arraycopy(s1, 0, res, s2.length, s1.length);
        nums = res;
        System.out.println(Arrays.toString(nums));
    }

    public void rotate_soultion(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums [start++] = nums[end];
            nums[end--] = temp;
        }
    }

}
