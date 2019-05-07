package String;

import java.math.BigInteger;

/**
 * @description:
 * @time:2019/5/6 二进制求和
 */
public class addBinary {

    public static void main(String[] args) {

//        String s1 = "1110110101";
//        String s2 = "1110111011";

        String s1 ="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String s2 ="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
//        String s1 = "11111";
//        String s2 = "11";

        System.out.println(addBinaryFunction3(s1,s2));
    }



    private static String addBinaryFunction3(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int a1 = s1.length()-1;
        int b1 = s2.length()-1;
        int carry = 0;

        while (a1>=0 || b1>= 0){
            int sum =carry;
            if (a1>=0){
                //字符转数字
                sum += (s1.charAt(a1) - '0');
                a1 --;
            }
            if (b1>=0){
                //字符转数字
                sum += (s2.charAt(b1) - '0');
                b1 --;
            }
            result.append(sum%2);
            carry = sum/2;
        }

        if (carry!=0){
            result.append(1);
        }


        return result.reverse().toString();
    }

    private static String addBinaryFunction2(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int len1 = str1.length;
        int len2 = str2.length;
        int n ;
        int max;


        if(len1 > len2){
            n=len1-len2;
            max = len1;
        }else {
             n=len2-len1;
             max = len2;
             char[] temp = str1;
             str2 = str1;
             str1 = str2;

        }

        char[] str3 = new char[max+1];
        int col=0;
        for (int i = max-1;i>n-1;i--){
            //char转int
            System.out.println(i);
            int x1 = (int)str1[i] - (int)'0';
            int x2 = (int)str2[i-n] - (int)'0';

            if (x1+x2+col >1){
            str3[i+1] = (char) (x1+x2-2+col+'0');
            col = 1;
//            System.out.println("str3:"+str3[i+1]);
            }else {
                str3[i+1] = (char) (x1+x2+'0');
//                System.out.println("str3:"+str3[i+1]);
                col = 0;
            }
        }
//        System.out.println("col:"+col);
        for (int i = n-1;i>-1;i--){
            //char转int

            int x1 = (int)str1[i] - (int)'0';

            if(x1+col>1){
                str3[i+1] = (char) (x1-2+col+'0');
                col = 1;
            }else{
                str3[i+1] = (char) (x1+'0');
                col = 0;
            }
        }

//        System.out.println("col:"+col);
        if (col>0){
            str3[0] = '1';
        }else {
            str3[0] = '0';
        }
//
//        for (int i=0;i<str3.length;i++){
//        System.out.print(str3[i]);}




        return String.valueOf(str3);
    }

    private static String addBinartFunction(String a, String b) {
        //字符串转数字
        double a1  = Integer.parseInt(a);
        System.out.println(a1);
        double b1 = Integer.valueOf(b);
        double i1 = a1+b1;
        //数字转字符串
        String num = String.valueOf(i1);


        //字符串转数组
        int[] x=new int[num.length()];
        for (int i=0; i<num.length();i++){
            x[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        //数组比较
        for (int i=x.length-1;i>0;i--){
            if (x[i]>=2){
                x[i-1] = x[i-1]+1;
                x[i] = x[i]-2;
            }
        }
        String s;
        if (x[0]>=2){
            x[0] = x[0]-2;
            s="1";
        }else{
            s="";
        }

        //数组转字符串
        for(int i=0;i<x.length;i++){
            s = s + x[i];//拼接成字符串，最终放在变量s中
        }
        return s;


    }

}
