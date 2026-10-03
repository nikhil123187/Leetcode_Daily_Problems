class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int mindiff = Integer.MAX_VALUE;

        int left = 0;
        int right = k -1;
        while(right< nums.length){
            int dif = nums[right] - nums[left];

            mindiff = Math.min(mindiff, dif);

            left++;
            right++;
        }
        return mindiff;
    }
}
