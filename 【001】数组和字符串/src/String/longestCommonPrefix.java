package String;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 * @description:
 * @time:2019/5/7 最长公共前缀
 */
public class longestCommonPrefix {

    public static void main(String[] args) {

        String[] s = {"aa","a"};

        System.out.println(solution(s));
    }

    private static String solution(String[] s) {
        if(s.length==0) return "";
        StringBuilder ss = new StringBuilder();
        char[] str1 = s[0].toCharArray();
//        System.out.println(str1);

        lableB:
        for (int i=0; i<str1.length;i++){
            char c = str1[i];
//            System.out.println(c);
            for (int j =0;j<s.length;j++){
                try {
                    if (s[j].charAt(i)!= c){
//                    System.out.println(1);
                        break lableB;
                    }
                }catch (Exception e){
                    break lableB;
                }


            }
            ss.append(c);
        }



        return ss.toString();

    }

}
