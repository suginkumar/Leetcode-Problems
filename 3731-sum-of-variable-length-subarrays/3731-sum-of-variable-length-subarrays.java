class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=allsum(nums,Math.max(0,i-nums[i]),i);
        }
        return sum;
    }
    public static int allsum(int[] a,int st,int en){
        int s=0;
        for(int i=st;i<=en;i++){
            s+=a[i];
        }
        return s;
    }
}