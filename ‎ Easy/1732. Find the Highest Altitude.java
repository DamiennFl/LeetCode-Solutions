class Solution {
    public int largestAltitude(int[] gain) {

        int highest = 0;
        int currentElevation = 0;
        for(int i = 0; i < gain.length; i++) {
            currentElevation += gain[i];
            if(currentElevation > highest) {
                highest = currentElevation;
            }
        }
        return highest;
    }
}