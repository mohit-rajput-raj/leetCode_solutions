class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        if((s[0]+s[1])%2 != (t[0]+ t[1])%2)return -1;
        int a = Math.abs(s[0]-t[0]);
        int b = Math.abs(s[1]-t[1]);
        if(a!=b)return 2;
        return 1;
    }
}