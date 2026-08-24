class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char st = s.charAt(i);
            char ls = s.charAt(j);

            if(!Character.isLetterOrDigit(st)){
                i++;
            }else if(!Character.isLetterOrDigit(ls)){
                j--;
            }else if(Character.toLowerCase(st) == Character.toLowerCase(ls)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
