class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            fmap.put(nums[i] , fmap.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(fmap);
        List<Integer>[] farr = new List[nums.length + 1];
        for(Map.Entry x : fmap.entrySet()){
            if(farr[(int)x.getValue()] == null){
                farr[(int)x.getValue()] = new ArrayList();
            }
            farr[(int)x.getValue()].add((Integer)x.getKey());
        }

        List<Integer> res = new ArrayList<>();
        for(int i=farr.length - 1; i>0;i--){
            List<Integer> list = farr[i];
            if(list!=null && list.size() > 0){
                while(list.size() > 0){
                    if(k <= 0) break;
                    res.add(list.remove(0));
                    k--;
                }
            }
            if(k <= 0) break;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
