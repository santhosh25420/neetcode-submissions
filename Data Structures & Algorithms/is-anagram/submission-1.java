class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if(arr1.length != arr2.length){
            return false;
        }

        Map<Character,Integer> arr1Counter = new HashMap<>();
        Map<Character,Integer> arr2Counter = new HashMap<>();

        for(int i=0;i<arr1.length;i++){
           if(arr1Counter.get(arr1[i])!=null){
            arr1Counter.put(arr1[i],arr1Counter.get(arr1[i])+1);
           }else{
           arr1Counter.put(arr1[i],1);
           }
        }

        for(int i=0;i<arr2.length;i++){
           if(arr2Counter.get(arr2[i])!=null){
            arr2Counter.put(arr2[i],arr2Counter.get(arr2[i])+1);
           }else{
            arr2Counter.put(arr2[i],1);
           }
           
        }

        for(Character key:arr1Counter.keySet()){
            if(!Objects.equals(arr1Counter.get(key),arr2Counter.get(key))){
                return false;
            }
        }
        return true;
    }
}
