class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        // int[] nums2 = new int[n];
        // int[] nums3 = new int[n];
        int ev = -1;
        int od = -1;
        int sev = Integer.MAX_VALUE-1;
        int sod = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]>ev){
                ev = nums1[i];
            }
            if(nums1[i]%2!=0 && nums1[i]>od){
                od = nums1[i];
            }
            if(nums1[i]%2==0 && nums1[i]<sev){
                sev = nums1[i];
            }
            if(nums1[i]%2!=0 && nums1[i]<sod){
                sod = nums1[i];
            }
        }
        if(od==-1 || ev==-1)return true;
        boolean d = false;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(!((nums1[i]-sod)>0)){
                    d = true;
                    break;
                }
            }
        }
        if(!d)return true;
        d = false;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                if(!((nums1[i]-sod)>0)){
                    d = true;
                    break;
                }
            }
        }
        if(!d)return true;
        return false;
    }
}