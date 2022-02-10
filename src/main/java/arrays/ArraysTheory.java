package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysTheory {

    // arrays
    public static void main1(String[] args) {

        // arrays are not dynmic data strusture. Have to define size.
        int[] arr = new int[10];

        // Iterate through array and assign O(n)
        for(int ind = 0; ind < arr.length; ind++){
            arr[ind] = ind + 1;
        }

        // Linear search
        // Find 6
        for(int ind = 0; ind < arr.length; ind++){
            if(arr[ind] == 6)
                System.out.println("The position of 6 is -> " + ind); // The position of 6 is -> 5
        }
    }

    // ArrayList
    public static void main(String[] args) {

        // ArrayList use standard array under the hood
        // Default capacity is 10
        List<String> names = new ArrayList<>();

        names.add("Alef");
        names.add("Bet");
        names.add("Gimel");
        names.add("Dalet");

        System.out.println(names.get(0)); // Alef
        System.out.println(names.get(2)); // Gimel


        names.remove(0);  // the item will be shifted   O(n)

        System.out.println(names.get(0)); // Bet
        System.out.println(names.get(2)); // Dalet

        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.size());  // 3
    }
}
