package arrays;

import java.util.Arrays;

public class AnagramProblem {

    /**
     * Construct an algorithm to check whether two words (or phrases) are anagrams or not!
     *
     * "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     *  typically using all the original letters exactly once"
     *
     * For example: restful and fluster are anagrams.
     */

    /*
     * Sort letters in both words and check if it is the same
     */

    public static boolean isAnagram(char[] subject, char[] anagram){

        //If both have different length - not anagram
        if(subject.length != anagram.length){
            return false;
        }

        // Sort O(n log n) <- bottleneck of the algorithm
        Arrays.sort(subject);
        Arrays.sort(anagram);

        // Run through the sorted arrays and compare each letter
        for(int i = 0; i < subject.length; i++){
            if(subject[i] != anagram[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("restful".toCharArray(), "fluster".toCharArray())); // true
        System.out.println(isAnagram("apple".toCharArray(), "orange".toCharArray())); // false
    }
}
