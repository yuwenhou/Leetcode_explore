package String;

/**
 *实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字
 * 符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 *
 * @description:
 * @time:2019/5/7
 */
public class strStr {

    public static void main(String[] args) {
     String haystack = "hello";
     String needle = "ll";
     System.out.println(soultion(haystack,needle));
     System.out.println(haystack.indexOf(needle));


    }

    private static int soultion(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }
}
