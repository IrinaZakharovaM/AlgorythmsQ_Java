package arrays;

import java.util.Arrays;

/**
 * Smallest difference between numbers in the given array
 */

public class SmallestDiff {

    private int[] arr;

    public SmallestDiff(int[] arr){
        this.arr = arr;
    }

    public int getSmallestDiff(){
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < this.arr.length; i++){
            for(int j = i + 1; j < this.arr.length; j++){
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));

            }
        }

        return diff;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestDiff(new int[] {1, 5, 3, 19, 18, 25}).getSmallestDiff());
        System.out.println(new SmallestDiff(new int[] {30, 5, 20, 9}).getSmallestDiff());
        System.out.println(new SmallestDiff(new int[] {1, 19, -4, 31, 38, 25, 100}).getSmallestDiff());
    }
}
