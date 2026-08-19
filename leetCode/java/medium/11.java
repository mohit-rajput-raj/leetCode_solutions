class Solution {
    public int maxArea(int[] height) {
        int k =0;
        int r = height.length-1;
        int max =0;
        while(k<r){
            int h1 = height[k];
            int rr = height[r];
            int min = Math.min(h1,rr);
            max = Math.max(max,min*(r-k));
            if(h1<rr) k++;
            else r--;

        }
        return max;
       
        
    }
}