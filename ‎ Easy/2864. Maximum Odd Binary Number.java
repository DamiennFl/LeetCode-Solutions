class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c = 0;
        int sL = s.length();
        String ret = "";
        for(int i = 0; i < sL; i++) {
            if(s.charAt(i) =='1') {
                c++;
            }
        }
        while(c > 1) {
            ret += "1";
            sL--;
            c--;
        }
        while(sL > 1) {
            ret += "0";
            sL--;
        }
        ret += "1";
        return ret;
    }
}