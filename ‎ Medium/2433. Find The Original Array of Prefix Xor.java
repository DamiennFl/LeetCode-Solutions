class Solution {
    public int[] findArray(int[] pref) {
        int[] xor = new int[pref.length];
        xor[0] = pref[0];

        for(int i = pref.length - 1; i > 0; i--) {
            xor[i] = pref[i - 1] ^ pref[i];
        }
        return xor;
    }
}