package String;

/**
 * @description:
 * @time:2019/5/6 不可变字符
 */
public class immutableString {

    public static void main(String[] args) {
        String s = "";
        int n = 10000;
        for (int i=0; i<n;i++){
            s+="hello ";
        }
        System.out.println(s);
        //时间复杂度O(n2)

        //解决办法
        //1.字符串转成字符数组
        String s1 = "hello World";
        char[] str = s1.toCharArray();
        str[5] = ',';
        System.out.println(str);

        //2.使用stringBuilder 线程不安全 速度快
        int n1 = 10000;
        StringBuilder str1 = new StringBuilder();
        for (int i=0;i<n;i++){
            str1.append("hello");
        }
        String s2 = str.toString();
        System.out.println();

    }




}
