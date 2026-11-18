
import java.util.HashMap;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (int count : map.values()) {
            if (Math.abs(count) > 3) {
                return false;
            }
        }

        return true;
    }
}
