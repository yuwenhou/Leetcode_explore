package doublePointer;

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组。
 * 如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 *
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * @description:
 * @time:2019/5/20 长度最小的子数组
 */
public class minSubArrayLen {

    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println("长度最小的数组："+solution2(s,nums));
    }

    private static int solution2(int s, int[] nums) {
        int left = 0;
        int right = -1;
        int len= nums.length+1;
        int sum = 0;
        while(left< nums.length){
            if (right+1<nums.length && sum<s){
                right++;
                sum+=nums[right];
            }else{
                sum-=nums[left];
                left++;
            }
            if (sum>=s){
                len = Math.min(len,right-left+1);
            }
        }

        if (len==nums.length+1){
            return 0;
        }else {
        return len;}
    }

    /**
     * 不连续数组
     * @param s
     * @param nums
     * @return
     */
    private static int solution(int s, int[] nums) {

       //冒泡排序
       for (int i=0; i<nums.length;i++){
           for (int j=0; j<nums.length-1-i;j++){
               if (nums[j+1] < nums[j]){
                   int temp = nums[j+1];
                   nums[j+1] = nums[j];
                   nums[j] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        int d = 0;
        for (int i=nums.length-1;i>=0;i--){
            sum = sum+nums[i];
            if(sum>= s){

                d = nums.length-i;
                break;
            }
        }
        return d;
    }


}
