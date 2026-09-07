class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> groupMap = new HashMap<>();

        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);
            groupMap.putIfAbsent(key,new ArrayList<>());
            groupMap.get(key).add(str);
        }

        
        return new ArrayList<>(groupMap.values());
    }
}
