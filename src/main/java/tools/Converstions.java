package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converstions {

    /**
     * Example of conversion String with "'" as delimiter to list
     */
    public static void main1(String[] args) {

        String str = "Alef, bet, gimel, dalet";
        List lst = new ArrayList<>(Arrays.asList(str.split(",")));
        System.out.println(lst); // [Alef,  bet,  gimel,  dalet]

    }

    /**
     * Example of conversion String with "'" as delimiter to list
     */
    public static void main2(String[] args) {

        String str = "Hello";
        List<Character> list = str.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
        System.out.println(list);

    }

    /**
     * Array to ArrayList
     */
    public static void main(String[] args) {
        String[] arrStr = new String[] {"a", "b", "c", "d"};
        List<String> lst = Arrays.asList(arrStr);
        System.out.println();
    }


}

