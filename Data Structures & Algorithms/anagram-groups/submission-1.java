class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int[] frarr;
        for(int i=0; i<strs.length;i++){
           frarr = new int[26];
           for(int j=0;j<strs[i].length();j++){
                frarr[strs[i].charAt(j)-'a']++;
           }
           StringBuilder sb = new StringBuilder();
           for(int x : frarr){
            sb.append('*');
            sb.append(x);
           }

           if(map.containsKey(sb.toString())){
            map.get(sb.toString()).add(strs[i]);
           }else{
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            map.put(sb.toString(), list);
           }
        }
        System.out.println(map);
        return new ArrayList(map.values());
    }
}
