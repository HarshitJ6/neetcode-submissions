class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char fromS = s.charAt(i);
            char fromT = t.charAt(i);

            map.put(fromS,map.getOrDefault(fromS,0)+1);
            map.put(fromT,map.getOrDefault(fromT,0)-1);
        }
        for(Integer x : map.values()){
            if(x!=0) return false;
        }
        return true;
    }
}
