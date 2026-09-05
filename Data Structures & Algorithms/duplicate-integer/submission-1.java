class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupCheck = new HashSet<>();

        for(int i:nums){
            if(!dupCheck.add(i)) return true;
        }
        return false;
    }
}