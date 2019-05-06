package String;

/**
 * @description:
 * @time:2019/5/5 字符串简介
 */
public class StringInduction {

    public static void main(String[] args) {
        /*比较函数*/
        //1.初始化
        String s1 = "hello world";
        System.out.println("s1 is \"" + s1 +"\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1");
        //comparing using "=="
        System.out.println("compared by '==':");
        System.out.println("s1 and \"Hello World\": " + (s1 == "hello world"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("hello world"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("hello world") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));

        /*2.是否可变
        * 不可变*/
        String s4 = "hello world";
//        s4[0] = 'H';
        System.out.println(s4);

        /*3额外操作*/
        //3.1 concatenate
        s4 += '!';
        System.out.println(s4);
        //3.2 find
        System.out.println("The position of first 'o' is :" + s1.indexOf('o'));
        System.out.println("The position of last 'o' is:" + s1.lastIndexOf('o'));
        //3.3 get substring
        System.out.println(s1.substring(6,11));

    }

}
