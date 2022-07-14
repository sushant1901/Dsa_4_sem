class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int k) 
    {
        HashMap<Long, Long> memo = new HashMap<>();
        long prefixSum = 0;
        long ans = 0;
        memo.put(0L, 1L);
        
        for(int i=0; i<k; i++){
            long currentVal = arr[i];
            prefixSum += currentVal;
            
            if(memo.containsKey(prefixSum)){
                long n = memo.get(prefixSum);
                ans+=n;
                memo.put(prefixSum, n + 1);
                
            }
            else{
                memo.put(prefixSum, 1L);
            }
        }
        
        return ans;
        
    }
}
