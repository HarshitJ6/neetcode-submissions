class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String anagramCode = generateAnagramCode(strs[i]);
            if(resMap.containsKey(anagramCode)){
                List<String> list = resMap.get(anagramCode);
                list.add(strs[i]);
                resMap.put(anagramCode, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                resMap.put(anagramCode, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry x : resMap.entrySet()){
            result.add((ArrayList)x.getValue());
        }

        return result;
    }

    public String generateAnagramCode(String str){
        int[] carr = new int[26];
        StringBuilder res = new StringBuilder();
        char[] schar = str.toCharArray();
        for(int i=0;i<schar.length;i++){
            carr[schar[i] - 'a']++;
        }

        for(int x : carr){
            res.append("*");
            res.append(x);
        }
        res.append("*");

        return res.toString();
    }
}
