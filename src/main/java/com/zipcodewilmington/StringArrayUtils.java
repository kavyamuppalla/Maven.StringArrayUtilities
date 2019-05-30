package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {


        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 1 - 1];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] str = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            str[i] = array[array.length -1- i];
        }
        return str;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palindrome  = true;
        String[] str = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            str[i] = array[array.length-1-i];

        }
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(str[i])) {
                palindrome = false;
            }
        }
        return palindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangramic = true;
        String str = "";
        for(int i = 0; i < array.length; i++) {
            str = str + array[i];
        }
        boolean[] alpha = new boolean[26];
        for(int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                alpha[ch - 'a'] = true;
            }
            else {
                if(ch >= 'A' && ch <= 'Z') {
                    alpha[ch - 'A'] = true;
                }
            }
        }
        for(int i = 0;i < 26; i++){
            if(!alpha[i]) {
                pangramic = false;
            }
        }
        return pangramic;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        //String str = "";
        for(int i =0; i < array.length;i++) {
            if(value.equals(array[i])) {
                count++;
            }
        }


        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] str = new String[array.length];
        List<String> a = new ArrayList<String>();
        for(int i = 0;i < array.length; i++) {
            if(!valueToRemove.equals(array[i])) {
                //str[i] = array[i];
                a.add(array[i]);
            }

        }
        str = a.toArray(new String[]{});


        return str;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] str = new String[array.length];
        //for(int i = 0; i < array.length; i++) {
        String con = array[0];
        List<String> l = new ArrayList<String>();
        for(int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i - 1])) {
                l.add(con);
                con = array[i];

            }


        }
        l.add(con);
        str = l.toArray(new String[]{});

        return str;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] str = new String[array.length];
        String con = array[0];
        List<String> l = new ArrayList<String>();
        for(int i = 1; i < array.length; i++) {
            if(array[i].equals(array[i - 1])) {
                con += array[i];

            }
            else {
                l.add(con);
                con = array[i];

            }
        }
        l.add(con);
        str = l.toArray(new String[]{});
        return str;
    }


}



