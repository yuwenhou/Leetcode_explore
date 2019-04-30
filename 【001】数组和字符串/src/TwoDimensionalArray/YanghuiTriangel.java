package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * @description:
 * @time:2019/4/30 杨辉三角
 */
public class YanghuiTriangel {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate2(numRows);
        for (List r:result ){
        System.out.println(r);
        }
    }

    private static List<List<Integer>> generate2(int numRows) {

            List<List<Integer>> result = new ArrayList<List<Integer>>();
            for(int i=0;i<numRows;i++){
                List<Integer> r = new ArrayList<>();
                for(int j=0;j<=i;j++){//边界
                    if(i==0||j==0||i==j){
                        r.add(1);
                    }else{
                        List<Integer> n = new ArrayList<>();
                        n=result.get(i-1);
                        r.add(n.get(j-1)+n.get(j));
                    }
                }
                result.add(r);
            }
            return result;

    }

    private static List<List<Integer>> generate(int numRows) {
        if (numRows==0) return new ArrayList<List<Integer>>();
        int[][] v = new int[numRows][];

        if (numRows==1) {
            v[0]= new int[1];
            v[0][0] = 1;
        }else if (numRows==2) {
            v[0]= new int[1];
            v[0][0] = 1;
            v[1]= new int[2];
            v[1][0] = 1;
            v[1][1] = 1;
        }else{
        int count = 2;
        v[0]= new int[1];
        v[0][0] = 1;
        v[1]= new int[2];
        v[1][0] = 1;
        v[1][1] = 1;
        for (int i = 2; i < numRows; i++) {
            v[i]= new int[i+1];
            v[i][0]  = 1;
            v[i][i]  = 1;
            for (int j = 1;j<count;j++){
                v[i][j]  = v[i-1][j-1]+v[i-1][j];
            }
            count++;
        }}
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i=0;i<v.length;i++){
            List<Integer> columList = new ArrayList<Integer>();
            for (int j=0;j<v[i].length;j++){
                columList.add(j,v[i][j]);
            }
            lists.add(i,columList);

        }
//        List<int[]> ints = Arrays.asList(v);
        return lists;
    }





}

























