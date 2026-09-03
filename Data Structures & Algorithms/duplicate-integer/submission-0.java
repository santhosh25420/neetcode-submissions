class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> dups = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(dups.get(nums[i])!=null){
                return true;
            }else{
                dups.put(nums[i],true);
            }
        }
        return false;
    }
}