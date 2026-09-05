class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i: nums){
            if(Objects.isNull(freqMap.get(i))){
                freqMap.put(i,0);
            }
            freqMap.put(i,freqMap.get(i)+1);
        }



        List<List<Integer>> buckets = new ArrayList<>(nums.length+1);
        for(int i=0;i<nums.length+1;i++){
            buckets.add(new ArrayList<>());
        }
        for(int key: freqMap.keySet()){
            buckets.get(freqMap.get(key)).add(key);
        }

       int[] result = new int[k];
        int index = 0;
        for(int i=buckets.size()-1;i>=0 && index<k;i--){
            for(int num: buckets.get(i)){
                result[index++] = num;
                if(index == k) break;
            }
        }
        return result;
    }
}
