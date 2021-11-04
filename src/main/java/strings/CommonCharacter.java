package strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Find the most common character in the given string
 */
public class CommonCharacter {

    private List<String> letters;

    public CommonCharacter(List letters) {
        this.letters = letters;
    }

    public String getMostCommonCharacter() {
        String rc = "";
        Set<String> set = new HashSet(this.letters);
        Map<String, Integer> map = new HashMap<>();
        int tmp;
        int maxCount = 0;
        for (int i = 0; i < this.letters.size(); i++) {
            if (!map.containsKey(this.letters.get(i))) {
                map.put(this.letters.get(i), 1);
            } else {
                tmp = map.get(this.letters.get(i));
                map.put(this.letters.get(i), ++tmp);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                rc = entry.getKey();
            }
        }
        return rc;
    }

    public static void main(String[] args) {

        String[] arrStr = new String[]{"c", "b", "s", "c", "c"};
        List<String> lst = Arrays.asList(arrStr);

        CommonCharacter commonCharacter = new CommonCharacter(lst);
        System.out.println(commonCharacter.getMostCommonCharacter());
    }
}
