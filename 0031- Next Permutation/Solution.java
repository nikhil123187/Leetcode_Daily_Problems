class Solution {
    public void nextPermutation(int[] nums) {

        // step 1 right side se pivot value ko dhundho
        int i = nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        // step 2 right side se pivot se bada number dhundo
        if(i>=0){
            int j = nums.length-1;
            while (nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // step 3 pivot ke baad ke element ko reverse kr do

        int left = i +1;
        int right = nums.length-1;

        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
