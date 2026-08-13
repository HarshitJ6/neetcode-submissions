class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for(int i=0;i<t.length();i++){
            Character c1 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) == 1){
                    map.remove(c1);
                }else{
                    map.put(c1, map.get(c1) - 1);
                }
            }else{
                return false;
            }
        }

        return map.size() == 0 ? true : false;

    }
}
