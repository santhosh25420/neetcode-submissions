class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> dups = new HashSet<>();
        int longest=0;
        for(int i : nums){
            dups.add(i);
        }
        for(int i : nums){
            int length =0;
            if(!dups.contains(i-1)){
                length++;
                while(dups.contains(i+length)){
                    length++;
                }
            }
            if(longest<length){
                longest = length;
            }
        }
        return longest;
    }
}
