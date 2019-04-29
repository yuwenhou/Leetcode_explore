package List;

import java.util.Arrays;

/**
 * @description:
 * @time:2019/4/29
 */
public class ArrayIn {
    public static void main(String[] args) {
        //1.Initialize
        int[] a0 = new int[5];
        int[] a1 = {1,2,3};
        //2.Get Length
        System.out.println("The size of a1 is:" + a1.length);
        //3.Acess Element
        System.out.println("The first element is:" + a1[0]);
        //4.Iterate all Element
        for (int e:a1){
            System.out.println(e);
        }
        //5.modify element
        a1[0] = 8;
        //6.sort
        Arrays.sort(a1);
    }
}
