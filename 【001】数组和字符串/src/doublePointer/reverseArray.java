package doublePointer;

/**
 * @description:
 * @time:2019/5/8 反转数组
 * 双指针就是两端向中间迭代数组
 */
public class reverseArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,5,4,6,8};
        reverse(a,a.length);
        for (int aa:a){
            System.out.print(aa +" ");
        }
    }

    private static void reverse(int[] v, int N) {
        int i=0;
        int j = N-1;
        while(i < j){
            swap(v,i,j);
            i++;
            j--;

        }



    }

    private static void swap(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] =temp;
    }
}
