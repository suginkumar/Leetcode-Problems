class Solution {
    public int[] getSneakyNumbers(int[] n) {
        int f[]=new int[n.length];
        int a[]=new int[2];
        int o=0;
        for(int i:n){
            f[i]++;
            if(f[i]==2) a[o++]=i;
        }
        return a;
    }
}