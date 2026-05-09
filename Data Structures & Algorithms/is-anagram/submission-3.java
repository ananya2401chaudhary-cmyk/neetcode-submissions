class Solution {
    public boolean isAnagram(String s, String t) {
        //edge cases
        boolean flag=false;
        if (s.length()!=t.length()){
            return false;
            
        }

        else{
        //main case
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        String s2 = String.valueOf(s1); 
        String t2 = String.valueOf(t1); 

        if (s2.equals(t2))
            flag=true;
        else
            flag=false;
        }
        return flag;
    }
}
