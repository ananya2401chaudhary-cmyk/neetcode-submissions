class Solution {
    public boolean isPalindrome(String s) {
        String newS=s.replaceAll("[^A-Z0-9a-z]","");
        String newStr=newS.toLowerCase().trim();
        
        StringBuilder sb = new StringBuilder(newStr);
        String rev= String.valueOf(sb.reverse());
        
        
        if (rev.equals(newStr))
            return true;
        else
            return false;    
    }
}
