package arrays;

import java.util.Arrays;

/**
 * Find all pairs with zero sum
 */

public class ZeroSum {

    private int[] arr;

    public ZeroSum(int[] arr){
        this.arr = arr;
    }

    public int[] getZeroSumPair(){
        int[] rc = new int[2];

        for(int i = 0; i < this.arr.length; i++){
            for(int j = i + 1; j < this.arr.length; j++){
                if(this.arr[i] + this.arr[j] == 0){
                    rc[0] = this.arr[i];
                    rc[1] = this.arr[j];
                    return rc;
                }
            }
        }

        return rc;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ZeroSum(new int[] {1, 2, -2,3}).getZeroSumPair()));
        System.out.println(Arrays.toString(new ZeroSum(new int[] {1, 2, -2, -1}).getZeroSumPair()));
        System.out.println(Arrays.toString(new ZeroSum(new int[] {0, 0, 0, 0}).getZeroSumPair()));
        System.out.println(Arrays.toString(new ZeroSum(new int[] {1, -1, -2, -1}).getZeroSumPair()));
    }


}
