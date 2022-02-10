package arrays;

import java.util.Arrays;

public class ArrayReverseInPlace {

    /**
     *     Reversing an array in-place overview
     *     The problem is that we want to reverse a T[] array in O(N) linear time complexity and we want the algorithm to be in-place as well -
     *     so the algorithm can not use additional memory!
     *
     *     For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
     */


    /**
     * We define first and last index and run through the half of the array and swap elements
     * @param arr
     */

    // O(n/2) O(n) Linear running time
    public static void reverseArray(int[] arr){

        int tmp = 0;
        int half = arr.length/2;
        for(int i = 0, j = arr.length - 1; i < half; i++, j--){
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5}); // [5, 4, 3, 2, 1]
        reverseArray(new int[]{1,2,3,4,5,6}); //  [6, 5, 4, 3, 2, 1]
        reverseArray(new int[]{1,1,1,2,2,2}); // [2, 2, 2, 1, 1, 1]
    }



}
