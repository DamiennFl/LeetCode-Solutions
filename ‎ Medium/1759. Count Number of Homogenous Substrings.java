class Solution {
    public int countHomogenous(String s) {
        int f=0;
        int n=0;
        int m= (int)1e9 + 7;
        for(int i=0; i<s.length();i++) {
            if(i==0||s.charAt(i)==s.charAt(i-1)) {
                n++;
            } else {
                n=1;
            }
            f=(f+n)%m;
            }
        return f;
    }
}