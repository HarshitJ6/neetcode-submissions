// <<<USING HASHMAP>>>
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) return false;

//         Map<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char fromS = s.charAt(i);
//             char fromT = t.charAt(i);

//             map.put(fromS,map.getOrDefault(fromS,0)+1);
//             map.put(fromT,map.getOrDefault(fromT,0)-1);
//         }
//         for(Integer x : map.values()){
//             if(x!=0) return false;
//         }
//         return true;
//     }
// }

// <<<USING FREQUENCY ARRAY>>
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int arr[] = new int[26]; 

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
         for(int i=0;i<t.length();i++){
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
