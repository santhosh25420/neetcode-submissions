class Solution {

    public String encode(List<String> strs) {
            StringBuffer sb = new StringBuffer();
            for(String str: strs){
                sb.append(str.length()).append("#").append(str);
            }
            return sb.toString();
    }

    public List<String> decode(String str) {
        char [] arr = str.toCharArray();
        int length =0;
        List<String> result = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        int i=0;
        while(i<arr.length){
            if(arr[i]!='#'){
                num.append(arr[i]);
            } else {
                length = Integer.parseInt(num.toString());
                num.setLength(0);
                result.add(new String(arr, i + 1, length));
                i += length;
            }
            i++;
        }

        return result;
    }
}
