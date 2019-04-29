package TwoDimensionalArray;

import java.util.Arrays;

/**

 给定一个含有 M x N 个元素的矩阵（M 行，N 列），
 请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 示例:

 输入:
 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]

 输出:  [1,2,4,7,5,3,6,8,9]


 */
public class findDiagonalOrder {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = new int[0][0];
        int[][] c = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        System.out.println(Arrays.toString(find(a)));
        //System.out.println(b.length);

    }

    private static int[] find(int[][] matrix) {
        if (matrix.length==0) return new int[0];

        int len = matrix.length*matrix[0].length;
        int[] b = new int[len];
        int count = 1;
        b[0] = matrix[0][0];
        int sum = 0;
        int i;
        int j;
        do {
            sum++;
            for( i=0 ; i<=sum;i++) {
                j = sum-i;
                if(sum%2 == 0) {
                    j =i;
                    i = sum - j;
                }
                if (i>=matrix.length){
                    if(sum%2 == 0) {
                        i= j;
                    }
                    continue;
                }else if (j >=matrix[0].length){
                    if(sum%2 == 0) {
                        i= j;
                    }
                    continue;
                }else {
                    b[count] = matrix[i][j];
                    count++;
                    if (count == len) break;
                    if(sum%2 == 0) {
                    i= j;
                    }
                }
            }

        }while(count != len);
        return b;
    }
}
