class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pairs = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int counterPart = target - nums[i];
            if(pairs.get(counterPart)!=null){
                return new int[]{pairs.get(counterPart),i};
            }else{
                pairs.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
