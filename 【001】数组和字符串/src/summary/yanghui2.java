package summary;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @time:2019/5/27 杨辉三角
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 */
public class yanghui2 {

    public static void main(String[] args) {
        int numRows = 3;
        List<Integer> result = getRow(numRows);

    }


    public static List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<Integer>();
        long nk = 1;
        for (int i=0; i<rowIndex;i++){
            res.add((int)nk);
            nk = nk * (rowIndex - i)/(i+1);
        }

        return res;
    }


}
