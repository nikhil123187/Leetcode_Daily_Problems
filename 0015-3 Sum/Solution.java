class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List <Integer>> list = new ArrayList<>();
       
        Arrays.sort(nums);

        for(int i =0;i<nums.length -2;i++){

            if(nums[i]>0){
                break;
            }
                if(i>0 && nums[i] == nums[i-1]){
                    continue;
                }
             int left = i+1;
        int right = nums.length -1;
        
        while(left<right){
               int sum = nums[i] + nums[left] + nums[right];
                  if(sum ==0){
            // 
            // list.add(List.of(nums[i], nums[left], nums[right]));
            
            ArrayList <Integer> temp = new ArrayList<>();

                  temp.add(nums[i]);
                  temp.add(nums[left]);
                  temp.add(nums[right]);

                    list.add(temp);
                  left++;
               // duplicate skip left side
               while(left<right && nums[left]== nums[left-1]){
                left++;
               }
              }else if(sum <0){
                left++;
              }else{
                right--;
              }
        }
        }
        return list;
    }
}

