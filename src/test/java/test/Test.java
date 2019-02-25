package test;

import com.ofzc.modules.tst.entity.User;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @Author: cjh27
 * @Date: 2019/2/14
 */
public class Test {


    public static void main(String[] args) {

//        逆转字符串——输入一个字符串，将其逆转并输出

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            String str = sc.nextLine();

            System.out.println(reverStr(str));

        }
//      String   str  = "ahsfiohsdoijh";

    }


    /**
     * 字符串逆序   Reverse reverse
     *
     * @param str
     */
    private static String reverStr(String str) {

        char[] chars = str.toCharArray();

        char[] reverChars = new char[chars.length];

        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            reverChars[j] = chars[i];
        }

        return new String(reverChars);

    }


}
