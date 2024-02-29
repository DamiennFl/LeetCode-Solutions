class Solution {
    public String gcdOfStrings(String str1, String str2) {

    int length1 = str1.length();
    int length2 = str2.length();
    int GCD = 0;

    if(!(str1+str2).equals(str2+str1))
        return "";


    for(int i = 1; i <= length1 && i <= length2; i++) {
        if(length1 % i == 0 && length2 % i == 0) {
            GCD = i;
        }
    }

    return str1.substring(0, GCD);

    }
}