package org.shazeb.Strings;

//import static java.lang.System.in;

import java.util.*;

public class reverseWordsInString {
    public static void main(String[] args) {
        String input = " hello world !  ";
        List<String> l1 = Arrays.asList("test3", "test4");
        List<String> l2 = new ArrayList<>();
        l2.add("test");
        l2.add("test3");
        l2.add("test4");
        diffList(l1,l2);
    }

    static String reverseString(String input) {
        char[] ch = input.toCharArray();
        StringBuilder sh = new StringBuilder();
        int left = 0, right = 0;
        for (int i = ch.length - 1; i >= 0; i--) {

            if (ch[i] == ' ') {
                if (left != 0) {
                    sh.append(input.substring(left, right + 1));
                    left = right = 0;
                }
                sh.append(ch[i]);

            } else {
                if ((left == 0 && right == 0)) {
                    left = i;
                    right = i;
                } else {
                    left--;
                }

            }
        }

        return sh.toString();
    }

    static void diffList(List<String> l1, List<String> l2) {
        Set<String> set = new HashSet<>();
        for (String w : l1) {
            if (!l2.contains(w)) {
                set.add(w);
//                System.out.println(w);
            }
        }
        for (String w : l2) {
            if (!l1.contains(w)) {
                set.add(w);
            }
        }

        System.out.println(set.toString());
    }


}
