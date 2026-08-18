class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer , Integer> counts = new HashMap<>();
        Map<Integer , Integer> maping = new HashMap<>();
        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        int len = nums.size();
        for(int i=0;i<len;i++){
            int tot = counts.get(nums.get(i));
            int freq = maping.getOrDefault(nums.get(i), 0) + 1;
            maping.put(nums.get(i), maping.getOrDefault(nums.get(i), 0) + 1);
            boolean l = (i-0+1)<2*freq;
            boolean r = (len-1-i)<2*(tot-freq);
            if(l && r){
                return i;
            }
            
        }
        return -1;
    }
}