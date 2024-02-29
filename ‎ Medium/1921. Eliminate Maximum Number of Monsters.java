import java.util.Arrays;

class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed){
        int[] aT=new int[dist.length];
        int a=0;
        int b=0;

        for(int i=0; i<dist.length;i++){
            if(speed[i]>dist[i]){
                aT[i]=1;
            }else{
                double t=(double)dist[i]/(double)speed[i];
                a=(int)Math.ceil(t);
                aT[i]=a;
            }
        }
        Arrays.sort(aT);
        for (int i=0; i<aT.length;i++){
            if(aT[i]<=b){
                break;
            }
            b++;
        }
        return b;
    }
}