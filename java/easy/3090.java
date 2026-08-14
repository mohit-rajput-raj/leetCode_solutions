class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 2;
        int[] a  = new int[26];
        int l =0;
        int r = 1;
        a[s.charAt(l)-'a']++;
        a[s.charAt(r)-'a']++;
        int len = s.length();

        while(r!=len-1){
            r++;
            char rc = s.charAt(r);
            
            a[rc-'a']++;
            if(a[rc-'a']>2){
                while(!(a[rc-'a']<3)){
                    char lc = s.charAt(l);
                    a[lc-'a']--;
                    l++;
                }
            }
            max = Math.max(r-l+1 , max);
        }
        return max;
    }
}