
class Solution {
    public String longestNiceSubstring(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (isNice(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }

        return ans;
    }

    public boolean isNice(String s) {

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {

                if (!s.contains(
                    String.valueOf(Character.toUpperCase(ch)))) {
                    return false;
                }

            } else {

                if (!s.contains(
                    String.valueOf(Character.toLowerCase(ch)))) {
                    return false;
                }
            }
        }

        return true;
    }
}
