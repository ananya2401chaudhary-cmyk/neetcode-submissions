class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean b=false;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key: map.keySet())
        {
            if (map.get(key)>1)
            {
                b=true;
                break;
            }
            else
                b=false;
        }
        return b;
    }
}