package org.shazeb;


import javax.swing.text.AttributeSet;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

class Main {

    public static void main(String[] args) {
//        System.out.println(isCamelCase());
//        sortByFreq();
//        binarySearch();
//        frequecy();
//        mergeArrays();
//        rotate(new int[]{1,2,3,4}, 2);
//        reverseWords();
        List<String> lis1 = new ArrayList<>();
        lis1.add("asdas");
        List<String> lis2 = new ArrayList<>();
        lis2 = lis1;
        lis2.add("bbbbb");
        System.out.println(lis1);
    }

    // string array contans letters words in lowercase and variable name is given. check whether variablename follows camel case and the
    //wordds of variable name exists in string array
    static boolean isCamelCase() {
        String[] arr = {"is", "this", "true", "false"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Set ->>>>>" + set);
        String word = "IsThisTrueOrNot";
        char[] words = word.toCharArray();
        StringBuilder str = new StringBuilder();
        if (Character.isLetter(word.charAt(0))) {
            str.append(word.charAt(0));
        } else return false;
        for (int i = 1; i < words.length; i++) {
            if (!Character.isLetter(words[i])) return false;
            if (Character.isLowerCase(words[i]) && i < words.length - 1) {
                str.append(words[i]);
            } else {
                if (i == words.length - 1) str.append(words[i]);
                System.out.println(str);
                if (!set.contains(str.toString().toLowerCase())) return false;
                str.setLength(0);
                str.append(words[i]);
            }
        }

        return true;
    }

    //Sort string by frequency of character
    public static void sortByFreq() {
        String str = "hello laala";
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        System.out.println(mp);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, (l1, l2) -> l2.getValue().compareTo(l1.getValue()));
        Map<Character, Integer> newMP = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> en : list) {
            newMP.put(en.getKey(), en.getValue());
        }
        System.out.println(newMP);
    }

    // Longest palindrome substring. Sol - select element and expand to check plindrome

    //Binary search algo
    public static void binarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;
        int l = 0, r = arr.length - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == num) {
                System.out.println(m);
                break;
            } else if (num > arr[m]) {
                l = m + 1;
            } else r = m - 1;
        }
    }

    //duplicate words
    static void duplicates() {
        String str = "a new dawn has dawn in a new way";
        Set<String> initial = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (String s : str.split(" ")) {
            if (!initial.contains(s)) initial.add(s);
            else result.add(s);
        }
        System.out.println(result);
    }

    //frequency of words in string
    static void frequecy() {
        String str = "a man never wants what he wants so keep yourself out of it." +
                "don't action visiously for it. ^& happen to it";
        Map<String, Integer> mp = new HashMap<>();
        String[] arr = str.replaceAll("[^\\w\\s]", "")
                .replaceAll("\\s+", " ")
                .split(" ");
        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        System.out.println(mp);

    }

    //merge sorted array
    public static void mergeArrays() {
        int[] first = {1, 2, 3, 4, 5, 11, 22};
        int[] second = {2, 3, 10, 21};
        int[] res = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        int len = Math.max(first.length, second.length);
        System.out.println(len);
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k++] = first[i++];
            } else {
                res[k++] = second[j++];
            }
        }
        if (first.length > second.length) {
            while (i < len) {
                res[k++] = first[i++];
            }
        } else {
            while (j < len) {
                res[k++] = second[j++];
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(res));
    }

    public static void rotate(int[] nums, int l) {
        l = l%nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, l - 1);
        reverse(nums, l, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] n, int i, int j) {
        while(i<j) {
            int temp = n[i];
            n[i++] = n[j];
            n[j--] = temp;
        }
    }

    //reverse words in string excluding vowels
    static void reverseWords(){
        String str = "I Love India";
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = new ArrayList<>(Arrays.asList(vowels));
        StringBuilder newString = new StringBuilder();
        for(String s: str.split(" ")){
            char[] arr = s.toCharArray();
//            System.out.println("------>"+Arrays.toString(arr));
            int l=0, r=arr.length-1;
            while(l<r){
                if(list.contains(arr[l])) l++;
                if(list.contains(arr[r])) r--;
                if(!list.contains(arr[l]) && !list.contains(arr[r])){
                    char temp = arr[l];
                    arr[l++] = arr[r];
                    arr[r--] = temp;
                }
            }
            newString.append(String.valueOf(arr)).append(" ");
        }
        System.out.println(newString);
    }



}
