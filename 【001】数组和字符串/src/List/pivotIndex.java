package List;

/**
 * 我们是这样定义数组中心索引的：
 * 数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果数组不存在中心索引，那么我们应该返回 -1。
 * 如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * 输入:
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出: 3
 * 解释:
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 */
public class pivotIndex {

    public static void main(String[] args) {
        int[] nums= {1,7,3,6,5,6};
        System.out.println(pivot(nums));
    }

    private static int pivot(int[] nums) {

        int numSum = 0;
        for(int n:nums){
            numSum += n;
        }
        int count = 0;
        for (int i = 0;i<nums.length;++i){
            if (numSum - nums[i] - count  == count)
                return i;
            count += nums[i];
        }
        return -1;
    }

}
