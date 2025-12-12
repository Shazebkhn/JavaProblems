package org.shazeb;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class generalProblems2 {
    public static void main(String[] args) {
        String[] arr = {"shazeb", "shaz", "shazad"};
//        System.out.println(longestPrefix(arr));
//        countVowelConsonants("ab  cd678f");
//        movezeroes(new int[]{3,4,-1,33,0,4,5,0,1,1});
//        rotateArray(new int[]{4,5,6,1,2,3,9}, 3);
//        firstRepeatedChar("abaccd");
//        sortcharacters("abcddeadab");
//        longestSubstring2("abcdabeg");
//        commonElements(new int[]{1,2,3,4}, new int[]{3,4,5,6});
//        numberOfWords("there is something that is spoiled");
//        digitFreqiuency(2234555);
//        sqrtCheck(144);
//        fibonacci(8);
//        checkSorteArray(new int[]{1,0,1});
//        validateParathesis("([{}]))");
//        System.out.println(gcdOfTwoNumbers2(19, 17));
//        duplicateInArray(new int[] {1,2,3,4,1,4,4});
//        sortUsingCollections(new int[]{2, 3, 5, 1, 8, 3, 1, 3});
//        System.out.println(factorial(5));
//        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
//        reverseLinkedList(list);
//        removeNonAlphaNumeric("abc&(asd23><,.");
//        titleCase("yoyo honey singh");
//        bubbleSort(new int[]{3, 4, 2, 6, 7, 1});
//        selectionSort(new int[]{3, 4, 2, 6, 7, 1});
//        queueUsingLinedList(new int[]{3, 4, 2, 6, 7, 1});
    }

    static String longestPrefix(String[] str) {
        String prefix = str[1];
        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (prefix.charAt(j) != str[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        if (prefix.length() <= 0) return "no matching prefix found";
        else return prefix;
    }

    static void countVowelConsonants(String str) {
        List<Character> list = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vowel = 0, consonent = 0;
        for (char ch : str.toCharArray()) {
            if (!Character.isAlphabetic(ch)) continue;
            if (list.contains(Character.toLowerCase(ch))) vowel++;
            else consonent++;

        }
        System.out.println("Vowels count " + vowel);
        System.out.println("Consonent count " + consonent);

    }

    //move zero to the end of array
    static void movezeroes(int[] num) {
        int newIndex = 0;
        int[] newarr = new int[num.length];
        for (int n : num) {
            if (n != 0) {
                newarr[newIndex] = n;
                newIndex++;
            }
        }
        while (newIndex < num.length) {
            newarr[newIndex] = 0;
            newIndex++;
        }
        System.out.println(Arrays.toString(newarr));
    }

    //rotate array to the right by k steps
    static void rotateArray(int[] num, int k) {
        k = k % num.length;
        int[] rotated = new int[num.length];
        int newIndex = 0;
        for (int i = num.length - k; i < num.length; i++) {
            rotated[newIndex] = num[i];
            newIndex++;
        }
        for (int i = 0; i < num.length - k; i++) {
            rotated[newIndex] = num[i];
            newIndex++;
        }
        System.out.println(Arrays.toString(rotated));
    }

    //first repeated character in a string
    static void firstRepeatedChar(String str) {
        StringBuilder checker = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (checker.toString().indexOf(c) == -1) checker.append(c);
            else {
                System.out.println("repated character is -->" + c);
                break;
            }
        }
    }

    //sort characters of string by frequency
    static void sortcharacters(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> a.getValue() > b.getValue() ? 1 : -1);
        StringBuilder strbuild = new StringBuilder();
        for (Map.Entry<Character, Integer> ent : list) {
            strbuild.append(String.valueOf(ent.getKey()).repeat(ent.getValue()));
        }
        System.out.println(strbuild);
    }

    //longest substring without repeating characters
    static void longestSubstring(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = 0, l = arr.length;
        String maxStr = "";
        StringBuilder s = new StringBuilder();
        Set<Character> set = new HashSet<>();
        while (right < l) {
            if (!set.contains(arr[right])) {
                s.append(arr[right]);
                set.add(arr[right++]);
                if (s.length() > maxStr.length()) {
                    maxStr = s.toString();
                }
            } else {
                if (s.length() > maxStr.length()) {
                    maxStr = s.toString();
                }
                left++;
                right = left;
                s.setLength(0);
                set.clear();
            }
        }
        System.out.println(maxStr);
    }

    static void longestSubstring2(String str) {
        int bestleft = 0, bestright = 0, left = 0, maxlength = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            if (mp.containsKey(str.charAt(right))) {
                left = Math.max(mp.get(str.charAt(left)) + 1, left);


            }
            mp.put(str.charAt(right), right);
            if (maxlength < right - left + 1) {
                bestleft = left;
                bestright = right;
                maxlength = right - left + 1;
            }
        }
        System.out.println(str.substring(bestleft, bestright + 1));
    }

    //find common elements in two integer arrays
    static void commonElements(int[] a, int[] b) {
        Set<Integer> set1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(b).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);

        System.out.println(set1);
    }

    //count number of words in sentence
    static void numberOfWords(String str) {
        String[] arr = str.trim().split(" ");
        System.out.println("Number of words are " + arr.length);
    }

    //digit frequency in a number
    static void digitFreqiuency(int num) {
        Map<Integer, Integer> mp = new HashMap<>();
        while (num > 0) {
            mp.put(num % 10, mp.getOrDefault(num % 10, 0) + 1);
            num = num / 10;
        }
        for (int key : mp.keySet()) {
            System.out.println("digit " + key + " occured " + mp.get(key) + " times");
        }
    }

    //Perfect Square check
    static void sqrtCheck(int num) {
        if (num < 0) {
            System.out.println("negaitve number not valid");
            return;
        }
        if (num < 2) {
            System.out.println("Perfect Square");
            return;
        }
        int lo = 1;
        int mid;
        //minimise the range by halfing
        int hi = num / 2 + 1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int sqr = mid * mid;
            if (sqr == num) {
                System.out.println("perfect square");
                return;
            }
            if (sqr < num) lo = mid + 1;
            else hi = mid - 1;
        }
        System.out.println("Not a perfect square");
    }

    static void fibonacci(int n) { //n: no of terms
        if (n < 2) {
            System.out.println("invalid number");
            return;
        }
        int i = 0, j = 1, sum = 0;
        System.out.println(i);
        System.out.println(j);
        while (n > 2) {
            sum = i + j;
            System.out.println(sum);
            i = j;
            j = sum;
            n--;
        }


    }

    //    Check if an array is sorted in ascending order
    static void checkSorteArray(int[] num) {
        int l = 0, r = 1, len = num.length;
        if (len < 1) {
            System.out.println("Array is empty");
            return;
        }
        if (len < 2) {
            System.out.println("Array is sorted");
            return;
        }
        while (r < len) {
            if (num[l] < num[r]) {
                l++;
                r++;
            } else {
                System.out.println("not a sorted array");
                return;
            }
        }
        System.out.println("Sorted array");
    }

    //Check if a string has balanced brackets
    static void validateParathesis(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');

        Deque<Character> dq = new ArrayDeque<>();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') dq.push(c);
            if (c == ')' || c == '}' || c == ']') {
                if (dq.isEmpty() || dq.pop() != mp.get(c)) {
                    System.out.println("Unbalanced Paranthesis");
                    return;
                }
            }
        }
        System.out.println("Balanced parenthesis");
    }

    // GCD of two numbers
    static int gcdOfTwoNumbers1(int a, int b) {
        if (a == 0 || b == 0) return -1;
        int gcd = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    //Euclid algorith gcd(a,b) = gcd(b,a%b)
    static int gcdOfTwoNumbers2(int a, int b) {
        if (b == 0) return a;
        return gcdOfTwoNumbers2(b, a % b);
    }

    //Count and print duplicate elements in an array
    static void duplicateInArray(int[] num) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        int count = 0;
        for (int n : num) {
            if (!set.add(n)) {
                count++;
                duplicates.add(n);
            }
        }
        System.out.println("Number of duplicates " + count);
        System.out.println("Duplicate are " + duplicates);

    }

    //Sort a list of integers using Java Collections
    static void sortUsingCollections(int[] num) {
        List<Integer> list = new ArrayList<>();
        for (int n : num) list.add(n);
        Collections.sort(list);
        System.out.println(list);
    }

    //Find factorial using recursion
    static int factorial(int n) {
//        if(n==0) return 1;
//        else return n*factorial(n-1);
        return n == 0 ? 1 : n * factorial(n - 1);

    }

    //Reverse a LinkedList without using Collections.reverse()
    static void reverseLinkedList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    //    Remove all non-alphanumeric characters from a string
    static void removeNonAlphaNumeric(String str) {
        StringBuilder builder = new StringBuilder();
        for (Character ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) builder.append(ch);
        }
        System.out.println(builder);
    }

    //    Convert a sentence to title case
    static void titleCase(String str) {
        String[] arr = str.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(Character.toUpperCase(s.charAt(0)));
            result.append(s.substring(1));
            result.append(" ");
        }
        System.out.println(result);
    }

    //bubble sort: swap two adjacent numbers is not in sorting order
    static void bubbleSort(int[] num) {
        boolean swapped = true;
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                    swapped = false;
                }
            }
            if (swapped) break;
        }
        System.out.println(Arrays.toString(num));
    }

    //selection sort: find smallest and swap it to start of array
    static void selectionSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n - 1; j++) {
                if (num[j + 1] < num[j]) {
                    min = j + 1;
                }
            }
            if (num[i] > num[min]) {
                int temp = num[i];
                num[i] = num[min];
                num[min] = temp;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    //Queue using linkedList. Linkedlist implements both Queue and List interface
    static void queueUsingLinedList(int[] num) {
        Queue<Integer> queue = new LinkedList<>();
        for(int n: num){
            queue.offer(n);
        }
        System.out.println("Queue is "+queue);
        while(!queue.isEmpty()){
            System.out.println("Polled "+queue.poll());

        }
    }

}
