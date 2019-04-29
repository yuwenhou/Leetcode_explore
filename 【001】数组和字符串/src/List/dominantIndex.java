package List;

import java.util.Arrays;

/**
 在一个给定的数组nums中，总是存在一个最大元素 。
 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 如果是，则返回最大元素的索引，否则返回-1。

 示例 1:
 输入: nums = [3, 6, 1, 0]
 输出: 1
 解释: 6是最大的整数, 对于数组中的其他整数,
 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.


 示例 2:
 输入: nums = [1, 2, 3, 4]
 输出: -1
 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 */
public class dominantIndex {

    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex1(nums));
    }

    private static int dominantIndex1(int[] nums) {
        if (nums.length <= 1) return 0;
        int[] A = nums.clone();
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        if (A[A.length-1]/2 < A[A.length-2] ) return -1;

        for (int i =0; i<nums.length;i++){
            if (nums[i] == A[A.length-1]) return i;
        }
        return -1;
    }


}
