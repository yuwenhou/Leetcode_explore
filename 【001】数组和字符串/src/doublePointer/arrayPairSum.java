package doublePointer;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 * 示例 1:
 *
 * 输入: [1,4,3,2]
 *
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * 提示:
 *
 * n 是正整数,范围在 [1, 10000].
 * 数组中的元素范围在 [-10000, 10000].
 *
 * @description:
 * @time:2019/5/8 数组拆分I
 */
public class arrayPairSum {
    public static void main(String[] args) {
        int[] i = {1,4,3,2};
        System.out.println(solution(i));
    }

    private static int solution(int[] a) {
        int sum = 0;
        for (int i=0;i<a.length;i++){
            int temp = a[i];
            int flag = i;   //将当前下表定义为最小值下标
            for (int j=i+1; j<a.length; j++){
             if(a[j]<temp){
                 temp = a[j];
                 flag = j;
             }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }

        for (int i=0;i<a.length;i=i+2){

            sum = sum +a[i];
        }
        return sum;
    }

}
