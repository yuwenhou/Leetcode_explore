package doublePointer;

/**
 * @description:
 * @time:2019/5/8 反转字符串
 */
public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseSolution(s);
        for (char ss:s){
            System.out.print(ss+" ");
        }
    }

    private static void reverseSolution(char[] s) {
        int i=0;
        int j= s.length-1;
        while (i<j){
            char temp = s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;

        }



    }


}
