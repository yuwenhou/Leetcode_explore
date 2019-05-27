package summary;

/**给定一个字符串，逐个翻转字符串中的每个单词。



 示例 1：

 输入: "the sky is blue"
 输出: "blue is sky the"
 示例 2：

 输入: "  hello world!  "
 输出: "world! hello"
 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 示例 3：

 输入: "a good   example"
 输出: "example good a"
 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。


 说明：

 无空格字符构成一个单词。
 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * @description:
 * @time:2019/5/27
 */
public class reverseWords {

    public static void main(String[] args) {
        String s =  "the   sky is blue";
        System.out.println(reverseWords2(s));
    }


    public static String reverseWords1(String s) {

        String[] s1 = s.split(" ");
        String res = "";
        for (int i = s1.length-1;i>=0;i--) {
            System.out.println(s1[i].isEmpty());
            System.out.println(s1[i]);
            res += s1[i];
            if (!s1[i].isEmpty() || i == 0){
                res += " ";
            }
        }
        res = res.trim();
        return res;
    }


    public static String reverseWords2(String s) {

        StringBuilder builder = new StringBuilder(s.length());
        int i = s.length()-1;
        while (i >= 0){
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i == -1) break;

            int j =s.lastIndexOf(' ', i);
            builder.append(s.substring(j + 1, i + 1) + " ");
            i = j-1;
        }
        if (builder.length()>0) builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

}





























