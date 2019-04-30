package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），
 * 请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 *
 * 示例 2:
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * @time:2019/4/30 螺旋矩阵
 */
public class spiralOrder {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix = {{1,2},{3,4}};


        List<Integer> s = spiral(matrix);
        for(int i =0;i<s.size();i++){
            System.out.print(s.get(i));
        }
    }

    private static List<Integer> spiral(int[][] matrix) {



        List<Integer> v = new ArrayList<>();
        if (matrix.length==0) return v;
        int l = 0;
        int u = 0;
        int r = matrix[0].length;
        int d = matrix.length;

        int j = 0;
        int i = 0;

        int count = matrix[0].length*matrix.length;
        int item = 0;
        do {

            for (int jj=j;jj<r;jj++){
                v.add(matrix[i][jj]);
                item++;
                j =jj;

            }
            i++;
            r--;
//            System.out.println("item:"+item);
//            System.out.println("i:"+i);
//            System.out.println("j:"+j);
//            System.out.println("d:"+d);

            if (item==count) return v;

            for (int ii=i;ii<d;++ii){
                v.add(matrix[ii][j]);
                item++;
                i = ii;
            }
            j--;
            d--;
//            System.out.println("item:"+item);
//            System.out.println("i:"+i);
//            System.out.println("j:"+j);
//            System.out.println("d:"+d);
            if (item==count) return v;

            for (int jj=j;jj>l;--jj){
                v.add(matrix[i][jj]);
                item++;
                j = jj;
            }
            j--;
            l++;
            System.out.println("item:"+item);
            System.out.println("i:"+i);
            System.out.println("j:"+j);
            System.out.println("d:"+d);
            System.out.println("count:"+count);

            if (item==count) return v;

            for (int ii=i;ii>u;ii--){
                v.add(matrix[ii][j]);
                item++;
                i = ii;
            }
            j++;
            u++;
//            System.out.println("item:"+item);

            if (item==count) return v;

//            System.out.println("i:"+i);
//            System.out.println("r:"+r);

        }while(item < count);
        return v;
    }


}
