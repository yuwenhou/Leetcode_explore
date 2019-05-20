package doublePointer;
/*
两数之和 II - 输入有序数组
        给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

        函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

        说明:

        返回的下标值（index1 和 index2）不是从零开始的。
        你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
        示例:

        输入: numbers = [2, 7, 11, 15], target = 9
        输出: [1,2]
        解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
*/

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {


        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println("取出两个下标："+ Arrays.toString(solution2(numbers, target)));

    }

    private static int[] solution(int[] numbers, int target) {
        int s1 =0;
        int s2 = 0;
        System.out.println(target);
        for (int i=0; i <numbers.length;i++){
            for (int j=i+1; j <numbers.length;j++) {
                if(numbers[i]+numbers[j] == target){
                    s1 = i+1;
                    s2 = j+1;
                    break;
                }
            }
        }
        return new int[]{s1, s2};
    }


    private  static int[] solution2(int[] numbers, int target){
        if (numbers == null || numbers.length<2){
            return null;
        }

        int[] res = new  int[2];
        int s1 = 0; int s2 = numbers.length-1;
        while(s1<s2){

            int left = numbers[s1];
            int right = numbers[s2];
            if(target < (left + right)){
                s2--;
            }else if (target > (left + right)){
                s1++;
            }else{
                res[0] = s1+1;
                res[1] = s2+1;
                break;
            }
        }

        return res;
    }










}























