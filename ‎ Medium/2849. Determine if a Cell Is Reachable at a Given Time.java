class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx&&sy==fy){
            if(t==1){
                return false;
            }else{
                return true;
            }
        }
        int n=0;
        int a=Math.max(Math.abs(fx-sx),Math.abs(fy-sy));
        if(a<=t){return true;}
        return false;
    }
}