class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> groupMap = new HashMap<>();
        int[] count = new int[26];
        for(String string: strs){
            Arrays.fill(count, 0);
            for(char c: string.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            groupMap.putIfAbsent(key, new ArrayList<>());
            groupMap.get(key).add(string);

        }
        for(String key: groupMap.keySet()){
            result.add(groupMap.get(key));
        }
        return result;
    }
}
