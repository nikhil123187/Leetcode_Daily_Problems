class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // s1 ki frequency
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            // current character add
            count2[s2.charAt(i) - 'a']++;

            // window size k se badi ho gayi
            if (i >= k) {
                count2[s2.charAt(i - k) - 'a']--;
            }

            // window size k hone ke baad check
            if (i >= k - 1 && Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
