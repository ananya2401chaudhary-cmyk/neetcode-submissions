class Solution {
    public boolean isPalindrome(String s) {
        String newS=s.replaceAll("[^A-Z0-9a-z]","");
        String newStr=newS.toLowerCase().trim();
        
        String rev="";
        for( int i=newStr.length()-1 ; i>=0; i--){
            char ch=newStr.charAt(i);
            rev=rev+String.valueOf(ch);
        }
        if (newStr.equals(rev))
            return true;
        else
            return false;    
    }
}
