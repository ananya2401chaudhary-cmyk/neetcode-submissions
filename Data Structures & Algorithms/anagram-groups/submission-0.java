class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList <String> list= new ArrayList<>();
        
        HashMap <String, ArrayList<String>> map= new HashMap <>();
        for(String s: strs ) {
            char arr[]= s.toCharArray();
            Arrays.sort(arr);
            String after= String.valueOf(arr);

            //map.computeIfAbsent(after, k -> new ArrayList<>()).add(s);
            ArrayList<String> keyValue;
            if (!map.containsKey(after)){
                keyValue = new ArrayList<>(); 
                map.put(after, keyValue);}
                
            else {
                keyValue= map.get(after);}
            keyValue.add(s);
            
        }
        
        return new ArrayList<>(map.values());
    }
}