class Solution {
    public long zeroFilledSubarray(int[] n) {
        long ts=0;
        int cc=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                cc++;
                ts+=cc;
            }else{
                cc=0;
            }
        }
        
        return ts;
    //     long ts=0;
    //     long cc=0;
    //     for(int i=0;i<n.length;i++){
    //         if(n[i]==0){
    //             cc++;
    //         }else{
    //             ts+=poss(cc);
    //             cc=0;
    //         } 
    //     }
    //     ts+=poss(cc);
    //     return ts;
    // }
    // public static long poss(long n){
    //     long h=0;
    //     for(int i=1;i<=n;i++){
    //         h+=i;
    //     }
    //     return h;
    }
}