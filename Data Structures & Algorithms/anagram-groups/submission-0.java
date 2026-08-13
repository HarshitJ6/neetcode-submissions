class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(map.containsKey(sortedString)){
                List<String> mapList = new ArrayList(map.get(sortedString));
                mapList.add(strs[i]);
                map.put(sortedString,mapList);
            }else{
                map.put(sortedString, List.of(strs[i]));
            }
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
