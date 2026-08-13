class Solution {
    public boolean isAnagram(String s, String t) {
        int[] carr = new int[26];
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray(); 
        for(int i=0;i<schar.length;i++){
            carr[schar[i] - 'a']++;
        }

        for(int i=0;i<tchar.length;i++){
            carr[tchar[i] - 'a']--;
            if(carr[tchar[i] - 'a'] < 0) return false;
        }
        for(int x : carr){
            if(x>0) return false;
        }

        return true;
    }
}
