class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int max = 0;
        for(int i =0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max = count;

        for(int i =k;i<s.length();i++){
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            if(isvowel(s.charAt(i))){
                count++;
            }

            max = Math.max(max,count );
        }
            return max;
    }

        private boolean isvowel(char c){
            return c == 'a' || c == 'e' || c =='i'
                    || c == 'o' || c == 'u'; 
        }
    
}
