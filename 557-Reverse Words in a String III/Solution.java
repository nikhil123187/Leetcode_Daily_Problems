
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                ans = ans + word.charAt(j);
            }

            if (i != words.length - 1) {
                ans = ans + " ";
            }
        }

        return ans;
    }
}
