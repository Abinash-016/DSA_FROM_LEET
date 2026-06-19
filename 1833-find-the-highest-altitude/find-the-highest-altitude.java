class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt=0;
        int currAlt=0;
        for(int i:gain){
            currAlt+=i;
            maxAlt=Math.max(maxAlt,currAlt);
        }

        return maxAlt;
        // int n=gain.length;
        // int[] res=new int[n+1];
        // res[0]=0;
        // for(int i=1;i<n;i++){
        //     res[i]=gain[i-1]+gain[i];
        // }
        // int max =0;
        // int  ans=0;
        // for(int i:res){
        //     ans=Math.max(i,max);
        // }
        // return ans;
    }
}